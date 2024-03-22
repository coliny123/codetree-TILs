import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(arr[i]<arr[j]){
                    if(max < arr[j] - arr[i]){
                        max = arr[j] - arr[i];
                    }
                }
            }
        }
        if(max == Integer.MIN_VALUE){
            max = 0;
        }
        System.out.println(max);


    }
}