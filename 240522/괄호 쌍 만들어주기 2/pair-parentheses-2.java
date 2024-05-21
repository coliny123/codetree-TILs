import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        int cnt = 0;
        for(int i=1; i<A.length()-2; i++){
            if(A.charAt(i-1) == '(' && A.charAt(i) == '('){
                for(int j=i+1; j<A.length()-1; j++){
                    if(A.charAt(j)== ')' && A.charAt(j+1)==')'){
                        cnt++;
                    }
                }
            }
        }


        System.out.println(cnt);
    }
}