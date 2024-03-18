import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[10];
        int result = 0;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<4; j++){
                sum += sc.nextInt();
            }
            arr[i] = sum/4;
        }
        for(int k=0; k<n; k++){
            if(arr[k] >=60){
                System.out.println("pass");
                result += 1;
            }else{
                System.out.println("fail");
            }
        }

        System.out.println(result);

    }
}