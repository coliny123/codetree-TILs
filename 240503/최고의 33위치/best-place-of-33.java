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
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N-2; i++){
            for(int j=0; j<N-2; j++){
                int cnt = 0;
                for(int k=i; k<i+3; k++){
                    for(int q=i; q<i+3; q++){
                        if(arr2d[k][q] == 1){
                            cnt++;
                        }
                    }
                }
                max = Math.max(max, cnt);
            }
        }

        System.out.println(max);

    }
}