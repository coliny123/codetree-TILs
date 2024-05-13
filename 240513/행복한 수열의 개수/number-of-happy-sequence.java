import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer = 0;

        int grid[][] = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        for(int row=0; row<n; row++){
            int cnt=1;
            int now=grid[row][0];
            if(n==1){
                answer++;
                break;
            }
            for(int col=1; col<n; col++){
                if(now == grid[row][col]){
                    cnt++;
                }else{
                    now = grid[row][col];
                    cnt = 1;
                }
                if(cnt >= m){
                    answer++;
                    break;
                }
            }
        }

        for(int col=0; col<n; col++){
            int cnt=1;
            int now=grid[0][col];
            if(n==1){
                answer++;
                break;
            }
            for(int row=1; row<n; row++){
                if(now == grid[row][col]){
                    cnt++;
                }else{
                    now = grid[row][col];
                    cnt = 1;
                }

                if(cnt >= m){
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);

    }
}