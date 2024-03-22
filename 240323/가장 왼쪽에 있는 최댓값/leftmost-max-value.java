import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int [n];
        int idx = -1;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;

        while(idx+1 != 1){
            for(int i=0; i<n; i++){
                if(arr[i] > max){
                    max = arr[i];
                    idx = i;
                }
            }
            System.out.print(idx+1 + " ");
            n = idx;
            max = Integer.MIN_VALUE;
        }



    }
}