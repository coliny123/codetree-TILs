import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[][]arr2d = new int[n][n];
        int count = 1;
        boolean up = true;

        for(int col=n-1; col>=0; col--){
            if(up){
                for(int row=n-1; row>=0; row--){
                    arr2d[row][col] = count;
                    count++;
                }
                up = false;
            }else{
                for(int row=0; row<n; row++){
                    arr2d[row][col] = count;
                    count++;
                }
                up = true;
            }
        }

        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                System.out.print(arr2d[row][col] + " ");
            }
            System.out.println();
        }

    }
}