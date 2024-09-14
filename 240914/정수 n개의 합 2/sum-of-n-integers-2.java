import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n+1];
        int sum[] = new int[n+1];

        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<=n; i++){
            sum[i] = sum[i-1] + arr[i];
        }

        int max = Integer.MIN_VALUE;

        for(int i=k; i<=n; i++){
            max = Math.max(max, sum[i] - sum[i-k]);
        }

        System.out.println(max);


    }
}