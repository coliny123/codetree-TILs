import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String sum1 = a+b;
        String sum2 = b+a;

        System.out.println(sum1.equals(sum2));
    }
}