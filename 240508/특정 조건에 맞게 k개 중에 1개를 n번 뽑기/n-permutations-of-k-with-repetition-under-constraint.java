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


    public static void choose(int curNum){
        // 종료 조건(초기값)
        if(curNum == n+1){
            print();
            return;
        }
        // 첫 번째 값을 넣는 순간 이거나
        // 이전 값이 0이 아닌 경우(1인 경우)
        for(int i=1; i<=k; i++){
            if(curNum >=3 && answer.get(curNum-2) == answer.get(curNum) && answer.get(curNum-1) == answer.get(curNum)){
                continue;
            }
            answer.add(i);
            choose(curNum+1);
            answer.remove(answer.size()-1);
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        
        choose(1);
    }
}