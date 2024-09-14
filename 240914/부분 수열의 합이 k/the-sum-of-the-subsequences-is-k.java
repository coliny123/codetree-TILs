import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력:
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n+1];
        int sum[] = new int[n+1];

        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i<= n; i++)
            sum[i] = sum[i - 1] + arr[i];

        int ans=0;
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                if(sum[j] - sum[i-1]==k){
                    ans++;
                }
            }
        }

        System.out.print(ans);

    }
}