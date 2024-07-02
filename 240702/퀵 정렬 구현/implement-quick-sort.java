import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        QuickSort(arr, 0, n-1);


        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void QuickSort(int arr[], int low, int high){
        if(low < high){
            int pos = partition(arr, low, high);
            QuickSort(arr, low, pos-1);
            QuickSort(arr, pos+1, high);
        }
    }

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j= low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}