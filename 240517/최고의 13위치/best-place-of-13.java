import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grid[][]=new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for(int row=0; row<n; row++){
            for(int col=0; col<n-2; col++){
                int coinNum= grid[row][col] + grid[row][col+1] + grid[row][col+2];

                max = Math.max(max, coinNum);
            }
        }

        System.out.println(max);

    }
}