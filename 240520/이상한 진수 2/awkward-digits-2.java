import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char str[] = a.toCharArray();

        for(int i=0; i<str.length; i++){
            if(str[i] == '0'){
                str[i] = '1';
                break;
            }
        }
        
        // for(int i=0; i<str.length; i++){
        //     System.out.print(str[i]);
        // }
        // System.out.println();

        String arrayString = String.valueOf(str);
        int binaryToDecimal = Integer.parseInt(arrayString, 2);

        System.out.println(binaryToDecimal);
    }
}