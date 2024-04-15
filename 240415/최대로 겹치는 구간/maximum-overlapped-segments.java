import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[200];
        int offset = 100;

        for(int i=0; i<n; i++){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            for(int j=offset+x1; j<offset+x2; j++){
                arr[j]++;
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}