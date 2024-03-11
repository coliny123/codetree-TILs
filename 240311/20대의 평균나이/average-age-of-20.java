import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        while(true){
            int n = sc.nextInt();
            if(n/10 != 2){
                double result = (double)sum/cnt;
                System.out.println(String.format("%.2f", result));
                break;
            }
            sum += n;
            cnt += 1;
        }
    }
}