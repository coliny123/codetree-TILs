import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while(s.length() > 1){
            int n = sc.nextInt();
            int len = s.length();
            if(n >= len){
                s = s.substring(0,len-1);
            }else if(n==0){
                s = s.substring(1,len);
            }else{
                s = s.substring(0,n) + s.substring(n+1);
            }
            System.out.println(s);
        }

    }
}