import java.util.*;

public class Main {
    public static boolean inRange(int x, int y, int n){
        return (0<=x && x<n && 0<= y && y<n);
    }

    public static int dx[] = new int[]{0, 1, 0, -1};
    public static int dy[] = new int[]{1, 0, -1, 0};


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr2d[][] = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr2d[i][j] = sc.nextInt();
            }
        }
        int answer = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int cnt = 0;
                for(int k=0; k<4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(inRange(nx, ny, n) && arr2d[nx][ny] == 1){
                        cnt++;
                    }
                }
                if(cnt >= 3){
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}