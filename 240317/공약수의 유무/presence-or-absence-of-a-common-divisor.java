import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean divisor = false;

        for(int i = a; i<=b; i++){
            if(1920%i == 0){
                if(2880%i == 0){
                    divisor = true;
                }
            }
        }
        if(divisor){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}