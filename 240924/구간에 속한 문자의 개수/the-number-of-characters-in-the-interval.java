import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int grid[][] = new int[n+1][m+1];
        int sum[][][] = new int[n+1][m+1][4];

        sc.nextLine();
        for(int i=1; i<=n; i++){
            String row = sc.nextLine();
            for(int j=1; j<=m; j++){
                char c = row.charAt(j-1);
                if(c=='a'){
                    grid[i][j] = 1;
                }else if(c=='b'){
                    grid[i][j] = 2;
                }else{
                    grid[i][j] = 3;
                }
            }
        }



        for(int c=1; c<=3; c++){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=m; j++){
                    int add = 0;

                    if(grid[i][j] == c) add = 1;

                    sum[i][j][c] = sum[i-1][j][c] + sum[i][j-1][c] - sum[i-1][j-1][c] + add;
                }
            }
        }

        while(k-- > 0){
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();

            int a = sum[r2][c2][1] - sum[r1-1][c2][1] - sum[r2][c1-1][1] + sum[r1-1][c1-1][1];
            int b = sum[r2][c2][2] - sum[r1-1][c2][2] - sum[r2][c1-1][2] + sum[r1-1][c1-1][2];
            int c = sum[r2][c2][3] - sum[r1-1][c2][3] - sum[r2][c1-1][3] + sum[r1-1][c1-1][3];

            System.out.println(a + " " + b + " " + c);
        }
    }
}