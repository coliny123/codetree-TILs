import java.util.Scanner;

public class Main {
    public static boolean checkPalindrome(String s){
        int len = s.length();
        for(int i=0; i<len/2; i++){
            if(s.charAt(i) != s.charAt(len-i-1)){
                return false;    
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean isPal = false;
        isPal = checkPalindrome(s);

        if(isPal){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}