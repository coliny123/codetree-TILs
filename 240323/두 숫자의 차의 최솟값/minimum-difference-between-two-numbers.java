import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<n; i++){
            for(int j=i; j<n; j++){
                if(min > arr[j]-arr[i-1]){
                    min = arr[j]-arr[i-1];
                }
            }
        }

        System.out.println(min);
    }
}