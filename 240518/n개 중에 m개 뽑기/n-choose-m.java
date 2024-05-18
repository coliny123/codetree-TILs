import java.util.*;


public class Main {
    public static int n;
    public static int m;
    public static boolean visited[];
    public static ArrayList<Integer> answer = new ArrayList<>();

    public static void print(){
        for(int i=0; i<answer.size(); i++){
            System.out.print(answer.get(i) + " ");
        }
        System.out.println();
    }

    public static void BT(int idx){
        if(idx == m+1){
            print();
            return;
        }


        for(int i=1; i<=n; i++){
            if(idx >1 && answer.get(answer.size()-1) >= i){
                continue;
            }
            // visited[i] = true;
            answer.add(i);
            BT(idx+1);
            answer.remove(answer.size()-1);
            // visited[i] = false;
        }
    }


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // visited = new boolean[n+1];

        BT(1);
    }
}