import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] countArr = new int[10];

        for(int i=0; i<arr.length; i++){
            int a = sc.nextInt();
            if(a == 0){
                break;
            }
            arr[i] = a;
        }

        for(int j=0; j<arr.length; j++){
            if(arr[j]==0){
                break;
            }
            countArr[arr[j]/10] += 1;
        }

        for(int k=1; k<countArr.length; k++){
            System.out.printf("%d - %d\n", k, countArr[k]);
        } 
    }
}