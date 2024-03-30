import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String original = s;
        int q = sc.nextInt();

        for(int i=0; i<q; i++){
            int n = sc.nextInt();
            if(n == 1){
                int a = sc.nextInt();
                int b = sc.nextInt();
                char[] sArr = s.toCharArray();

                char tmp = sArr[a-1];
                sArr[a-1] = sArr[b-1];
                sArr[b-1] = tmp;
                s = String.valueOf(sArr);

            }else{
                String a = sc.next();
                String b = sc.next();
                s = s.replace(a, b);
            }
            System.out.println(s);
        }
    }
}