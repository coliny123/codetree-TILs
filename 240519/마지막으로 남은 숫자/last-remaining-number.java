import java.util.*;

public class Main {
    public static PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-- > 0){
            pq.add(sc.nextInt());
        }

        while(pq.size() >=2){
            int max = pq.poll();
            int secondMax = pq.poll();
            if(max == secondMax){
                continue;
            }else{
                pq.add(max-secondMax);
            }
        }


        if(!pq.isEmpty()){
            System.out.println(pq.poll());
        }else{
            System.out.println(-1);
        }
    }
}