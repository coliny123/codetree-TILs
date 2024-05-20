import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            int sumDist = 0;
            for(int j = 0; j < n; j++) {
                int dist = (j + n - i) % n;
                sumDist += dist * arr[j];
            }
            ans = Math.min(ans, sumDist);
        }

        System.out.println(ans);
    }
}