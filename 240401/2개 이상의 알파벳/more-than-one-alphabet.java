import java.util.Scanner;

public class Main {
    public static boolean check(String A){

        String s = "";
        for(int i=0; i<A.length(); i++){
            String k = A.substring(i,i+1);
            if(s.contains(k) != true){
                s += A.charAt(i);
            }
        }
        if(s.length() >= 2){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        boolean isTrue = false;
        isTrue = check(A);
        if(isTrue){
            System.out.println("Yes");
        }else{
            System.out.println("No");

        }

    }
}