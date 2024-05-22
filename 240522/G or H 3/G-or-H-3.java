import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10001];
        int n = sc.nextInt();
        int k = sc.nextInt();


        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int idx = sc.nextInt();
            char a = sc.next().charAt(0);

            if(a == 'G')
                arr[idx] = 1;
            else   
                arr[idx] = 2;

            max = Math.max(max, idx);
        }

        int maxSum=0;
        for(int i=1; i<=max-k; i++){
            int sum=0;
            for(int j=i; j<=i+k; j++){
                sum += arr[j];
            }

            maxSum = Math.max(maxSum, sum);
        }


        System.out.println(maxSum);



    }
}