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
        dp[0][0] = graph[0][0];
        for(int i=1; i<n; i++){
            dp[i][0] = dp[i-1][0] +graph[i][0];
        }

        for(int i=1; i<n; i++){
            dp[0][i] = dp[0][i-1] +graph[0][i];
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<n; j++){
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) +graph[i][j];
            }
        }

        System.out.println(dp[n-1][n-1]);
    }
}