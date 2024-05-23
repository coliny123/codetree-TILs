import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long graph[][] = new long[n][n];
        long dp[][] = new long[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                graph[i][j] = sc.nextInt();
            }
        }
        dp[0][n-1] = graph[0][n-1];
        for(int i=1; i<n; i++){
            dp[i][n-1] = dp[i-1][n-1] +graph[i][n-1];
        }

        for(int i=n-2; i>=0; i--){
            dp[0][i] = dp[0][i+1] +graph[0][i];
        }

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         System.out.print(dp[i][j]);
        //     }
        //     System.out.println();
        // }

        for(int i=1; i<n; i++){
            for(int j=n-2; j>=0; j--){
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j+1]) +graph[i][j];
            }
        }

        System.out.println(dp[n-1][0]);
    }
}