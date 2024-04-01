import java.util.Scanner;

public class Main {

    public static int multiple(int n){
        if(n < 10){
            return n*n;
        }

        return multiple(n/10) + ((n%10)*(n%10));
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = multiple(n);

        System.out.println(result);

    }
}