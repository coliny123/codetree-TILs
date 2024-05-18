import java.util.*;

public class Main {
    public static int n;
    public static int cnt = 0;
    public static ArrayList<Integer> answer = new ArrayList<>();

    public static boolean isBeautiful(){
        for(int i=0; i<answer.size(); i+= answer.get(i)){
            if(i+answer.get(i)-1 >= answer.size()){
                return false;
            }
            for(int j=i; j<i+answer.get(i); j++){
                // System.out.println(i + " " + j);
                if(answer.get(j) != answer.get(i)){
                    return false;
                }
            }
        }
        // System.out.println("cnt");
        return true;
    }



    public static void BT(int idx){
        // 종료조건
        if(idx == n+1){
            // for(int i=0; i<answer.size(); i++){
            //     System.out.print(answer.get(i) + " ");
            // }
            // System.out.println();
            if(isBeautiful()){
                cnt++;
            }
            return;
        }


        // 다음 넣기
        for(int i=1; i<=4; i++){
            answer.add(i);
            BT(idx+1);
            answer.remove(answer.size()-1);
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        BT(1);
        System.out.println(cnt);
    }
}