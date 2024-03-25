import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][]arr2d = new int[n][n];

        for(int i=0; i<m; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            arr2d[r-1][c-1] = r*c;
        }

        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                System.out.print(arr2d[row][col] + " ");
            }
            System.out.println();
        }

    }
}