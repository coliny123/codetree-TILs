import java.util.*;

class Pair implements Comparable<Pair> {
    int x, y;

    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair p){
        return (Math.abs(this.x)+Math.abs(this.y) - (Math.abs(p.x)+Math.abs(p.y)));
    }
};

public class Main {
    public static PriorityQueue<Pair> pq = new PriorityQueue<>();

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        while(n-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            pq.add(new Pair(x, y));

        }

        while(m-- > 0){
            Pair closedPair =pq.poll();
            pq.add(new Pair(closedPair.x+2, closedPair.y+2));
        }

        Pair answer = pq.poll();
        System.out.println(answer.x + " " + answer.y);

    }
}