import java.util.*;

public class Main {
    public static int k;
    public static int n;
    public static ArrayList<Integer> answer = new ArrayList<>();

    public static void print(){
        for(int i=0; i<answer.size(); i++){
            System.out.print(answer.get(i) + " ");
        }
        System.out.println();
    }


    public static void BT(int idx){
        // 종료조건
        if(idx == n+1){
            print();
            return;
        }

        // 다음 넣기
        for(int i=1; i<=k; i++){
            answer.add(i);
            BT(idx+1);
            answer.remove(answer.size()-1);
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        k = sc.nextInt();
        n = sc.nextInt();

        BT(1);

    }
}