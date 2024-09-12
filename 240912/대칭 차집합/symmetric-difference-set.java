import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        int cnt=0;
        for(int i=0; i<a; i++){
            setA.add(sc.nextInt());
        }
        for(int i=0; i<b; i++){
            int input = sc.nextInt();
            setB.add(input);
            if(!setA.contains(input)){
                cnt++;
            }
        }
        for(int v:setA){
            if(!setB.contains(v)){
                cnt++;
            }
        }

        System.out.println(cnt);


    }
}