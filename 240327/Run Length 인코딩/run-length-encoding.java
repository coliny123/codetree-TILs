import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        char before = str.charAt(0);
        int cnt = 0;
        String result = "";


        for(int i=0; i<len; i++){
            if(str.charAt(i) == before){
                cnt++;
            }else{
                result += before;
                result += Integer.toString(cnt);

                before = str.charAt(i);
                cnt = 1;
            }
            if(i == len-1){
                result += before;
                result += Integer.toString(cnt);
            }
        }

        System.out.println(result.length());
        System.out.println(result);
    }
}