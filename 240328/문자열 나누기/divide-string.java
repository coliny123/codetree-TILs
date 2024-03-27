import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = " ";

        for(int i=0; i<n; i++){
            String a = sc.next();
            str += a;
        }


        for(int i=1; i<str.length(); i++){
            System.out.print(str.charAt(i));
            if(i%5==0){
                System.out.println();
            }
        }
    }
}