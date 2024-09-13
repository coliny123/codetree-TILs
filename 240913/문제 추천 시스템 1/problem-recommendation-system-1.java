import java.util.*;

class Node implements Comparable<Node>{
    int p, l;

    public Node(int p, int l){
        this.p=p;
        this.l=l;
    }

    @Override
    public int compareTo(Node x){
        if(this.l == x.l){
            return this.p - x.p;
        }else{
            return this.l - x.l;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeSet<Node> set = new TreeSet<>();
        while(n-- > 0){
            int p = sc.nextInt();
            int l = sc.nextInt();

            set.add(new Node(p, l));
        }

        int m = sc.nextInt();

        sc.nextLine();
        while(m-- > 0){
            String commend = sc.next();
            // System.out.println(commend);
            if(commend.equals("ad")){
                int P = sc.nextInt();
                int L = sc.nextInt();
                set.add(new Node(P, L));
            }else if(commend.equals("rc")){
                int X = sc.nextInt();
                if(X==1){
                    System.out.println(set.last().p);
                }else{
                    System.out.println(set.first().p);
                }
            }else{
                int P = sc.nextInt();
                int L = sc.nextInt();
                set.remove(new Node(P, L));
            }
        }

    }
}