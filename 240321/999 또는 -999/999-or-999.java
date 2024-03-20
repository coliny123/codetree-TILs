import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[100];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            int a = sc.nextInt();
            arr[i] = a;
            if(a == -999 || a == 999){
                break;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == -999 || arr[i] == 999){
                break;
            }
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }

        }

        System.out.printf("%d %d", max, min);

    }
}