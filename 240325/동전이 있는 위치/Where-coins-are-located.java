import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][]arr2d = new int[n+1][n+1];

        for(int i=0; i<m; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            arr2d[r][c] = 1;
        }

        for(int row=1; row<n+1; row++){
            for(int col=1; col<n+1; col++){
                System.out.print(arr2d[row][col] + " ");
            }
            System.out.println();
        }

    }
}