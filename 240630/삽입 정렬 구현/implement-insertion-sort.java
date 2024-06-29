import java.util.*;

public class Main {
    public static int n;
    public static int arr[];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        insertionSort();

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(){
        for(int i=1; i<n; i++){
            int j = i-1;
            int target = arr[i];

            while(j>=0 && target < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = target;
        }
    }
}