import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arrStr = new String[n];

        for(int i=0; i<n; i++){
            arrStr[i] = sc.next();
        }

        char a = sc.next().charAt(0);

        int sum = 0;
        int cnt = 0;

        for(int i=0; i<n; i++){
            if(arrStr[i].charAt(0) == a){
                int len = arrStr[i].length();
                sum += len;
                cnt++;
            }
        }

        System.out.printf("%d %.2f", cnt, (double)sum/cnt);
    }
}