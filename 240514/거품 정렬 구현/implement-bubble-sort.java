import java.util.*;

public class Main {
    public static int n;
    public static int arr[];

    public static void bubbleSort(){

    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        boolean sorted = true;

        do{
            sorted = true;
            for(int j=0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sorted = false;
                }
            }
        }while(sorted == false);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }



    }
}