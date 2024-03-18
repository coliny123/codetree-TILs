import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[]arr = new int[10]; // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        int result = 0;

        for(;;){
            arr[a%b] += 1;
            a = a/b;
            if(a<=1){
                break;
            }
        }

        for(int i=0; i<arr.length; i++){
            result += (arr[i]*arr[i]);
        }
        System.out.println(result);
    }
}