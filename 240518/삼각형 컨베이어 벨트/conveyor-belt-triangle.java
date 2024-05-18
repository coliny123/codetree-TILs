import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int arr[] = new int[3*n];

        for(int i=0; i<3*n; i++){
            arr[i] = sc.nextInt();
        }


        while(t-- > 0){
            int temp = arr[3*n-1];
            for(int i=3*n-1; i>=1; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=n; i<2*n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=2*n; i<3*n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}