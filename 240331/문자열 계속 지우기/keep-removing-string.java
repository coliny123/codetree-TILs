import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        while(A.contains(B)){
            // int len = B.length();
            // int idx = A.indexOf(B);
            A = A.replaceFirst(B, "");
        }

        System.out.println(A);



    }
}