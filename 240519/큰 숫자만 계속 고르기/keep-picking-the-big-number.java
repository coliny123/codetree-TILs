import java.util.*;

public class Main {
    public static PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++){
            pq.add(sc.nextInt());
        }

        while(m-- > 0){
            int max = pq.poll();
            pq.add(max-1);
        }

        System.out.println(pq.poll());
        // 여기에 코드를 작성해주세요.
    }
}