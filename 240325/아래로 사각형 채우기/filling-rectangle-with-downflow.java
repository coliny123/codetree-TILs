import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]arr2d = new int[n][n];
        int num = 1;

        for(int j=0; j<n; j++){
            for(int i=0; i<n; i++){
                    arr2d[i][j] = num;
                    num += 1;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}