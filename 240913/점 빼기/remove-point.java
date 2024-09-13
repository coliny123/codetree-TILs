import java.util.*;

class Node implements Comparable<Node>{
    int x, y;

    public Node(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public int compareTo(Node x){
        if(this.x == x.x){
            return this.y - x.y;
        }else{
            return this.x - x.x;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        TreeSet<Node> set = new TreeSet<>();
        while(n-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            set.add(new Node(x, y));
        }

        while(m-- > 0){
            int k = sc.nextInt();
            if(set.higher(new Node(k, -1)) == null){
                System.out.println("-1 -1");
            }else{
                Node target = set.higher(new Node(k, -1));
                System.out.println(target.x + " " + target.y);
                set.remove(target);
            }
        }
    }
}