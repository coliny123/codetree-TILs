import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] strArr = str.toCharArray();

        char a = strArr[0];
        char b = strArr[1];

        for(int i=0; i<str.length(); i++){
            if(strArr[i] == a){
                strArr[i] = b;
            }else if(strArr[i] == b){
                strArr[i] = a;
            }
        }

        str = String.valueOf(strArr);
        System.out.println(str);

    }
}