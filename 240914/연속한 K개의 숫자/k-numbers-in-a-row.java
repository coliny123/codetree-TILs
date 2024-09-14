import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력:
        int n = sc.nextInt();
        int k = sc.nextInt();
        int b = sc.nextInt();

        int arr[] = new int[n+1];
        int sum[] = new int[n+1];

        while(b-- > 0) {
            int x = sc.nextInt();
            // 해당 숫자들이 주어진 자리에
            // 숫자 1을 적어줍니다.
            arr[x] = 1;
        }

        for(int i=1; i<=n; i++){
            sum[i] = sum[i-1] + arr[i];
        }

        int ans = Integer.MAX_VALUE;
        for(int i = k; i <= n; i++)
            ans = Math.min(ans, sum[i] - sum[i-k]);

        System.out.print(ans);


    }
}