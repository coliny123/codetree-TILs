import java.util.*;

public class Main {
    public static int arr2d[][];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr2d = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr2d[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for(int row=0; row<N; row++){
            for(int col=0; col<N; col++){
                if(row +2 >= N || col + 2 >= N){
                    continue;
                }
                int cnt = 0;
                for(int i= row; i<=row+2; i++){
                    for(int j=col; j<=col+2; j++){
                        cnt += arr2d[i][j];
                    }
                }
                max = Math.max(max, cnt);
            }
        }

        System.out.println(max);

    }
}