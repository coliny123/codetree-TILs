import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char a = s.charAt(1);
        char b = s.charAt(0);

        s = s.replace(a, b);
        System.out.println(s);
    }
}