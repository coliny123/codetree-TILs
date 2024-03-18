import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int idx = 0;
        int sum = 0;
        for(int i=0; i<10; i++){
            int a = sc.nextInt();
            if(a >= 250){
                break;
            }
            arr[i] = a;
            idx = i;
        }
        for(int j=0; j<=idx; j++){
            sum += arr[j];
        }

        System.out.printf("%d %.1f", sum, (double)sum/(idx+1));
    }
}