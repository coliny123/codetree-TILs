import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int prev = 0;
        for(int i=0; i<10; i++){
            int a = sc.nextInt();
            if(a%3==0){
                break;
            }
            prev = a;
        }
        System.out.println(prev);
    }
}