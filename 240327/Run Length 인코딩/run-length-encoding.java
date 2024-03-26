import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        char before = str.charAt(0);
        int cnt = 1;
        StringBuilder sb = new StringBuilder();


        for(int i=1; i<len; i++){
            if(str.charAt(i) == before){
                cnt++;
            }else{
                sb.append(before);
                sb.append(cnt);

                before = str.charAt(i);
                cnt = 1;
            }
            if(i == len-1){
                sb.append(before);
                sb.append(cnt);
            }
        }

        System.out.println(sb.length());
        System.out.println(sb.toString());
    }
}