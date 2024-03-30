import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int cnt = 0;

        for(int i=0; i<str1.length()-1; i++){
            if(str1.charAt(i) == str2.charAt(0) && str1.charAt(i+1) == str2.charAt(1)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}