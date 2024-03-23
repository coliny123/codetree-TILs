import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][]arr = new int[2][4];

        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int totalSum = 0;
        for(int i=0; i<2; i++){
            int sum = 0;
            for(int j=0; j<4; j++){
                sum += arr[i][j];
                totalSum += arr[i][j];
            }
            System.out.printf("%.1f ",(double)sum/4);
        }
        System.out.println();

        for(int j=0; j<4; j++){
            int sum = 0;
            for(int i=0; i<2; i++){
                sum += arr[i][j];
            }
            System.out.printf("%.1f ",(double)sum/2);
        }
        System.out.println();
        System.out.printf("%.1f ",(double)totalSum/8);
    }
}