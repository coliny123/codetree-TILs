import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        int cnt = 0;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == '('){
                for(int j=i; j<A.length(); j++){
                    if(A.charAt(j) == ')'){
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}