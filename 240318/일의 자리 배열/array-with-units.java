import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[10];
        int a = sc.nextInt();
        int b = sc.nextInt();
        arr[0] = a;
        arr[1] = b;
        int temp = 0;
        for(int i=2; i<10; i++){
            temp = arr[i-2]+arr[i-1];
            int first=0;
            if(temp >=10){
                first = temp%10;
            }else{
                first = temp;
            }
            arr[i] = first;
        }

        for(int j=0; j<arr.length; j++){
            System.out.printf("%d ", arr[j]);
        }



    }
}