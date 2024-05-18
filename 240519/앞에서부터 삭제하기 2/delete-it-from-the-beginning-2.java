import java.util.*;

public class Main {
    public static PriorityQueue<Integer> pq = new PriorityQueue<>();
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        double maxAvg = 0;
        int sumVal = 0;
        pq.add(arr[n-1]);
        sumVal += arr[n-1];
        for(int i=n-2; i>=1; i--){
            pq.add(arr[i]);
            sumVal += arr[i];

            double avg = (double)(sumVal - pq.peek()) / (n-i-1);

            maxAvg = Math.max(maxAvg, avg);


        }

        System.out.printf("%.2f", maxAvg);

    }
}