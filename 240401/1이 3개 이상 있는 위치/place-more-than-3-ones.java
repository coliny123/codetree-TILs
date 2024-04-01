import java.util.Scanner;

public class Main {
    public static boolean inRange(int nx, int ny, int n){
        return (0<= nx && nx < n && 0 <= ny && ny <n);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int [] dx = new int[]{0, 1, 0, -1};
        int [] dy = new int[]{1, 0, -1, 0};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr2d = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr2d[i][j] = sc.nextInt();
            }
        }

        int result = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int x = i;
                int y = j;
                int cnt = 0;

                for(int dirNum=0; dirNum<4; dirNum++){
                    int nx = x + dx[dirNum], ny = y + dy[dirNum];
                    if(inRange(nx, ny, n) && arr2d[nx][ny] == 1){
                        cnt++;
                    }
                }
                if(cnt >= 3){
                    result++;
                }
            }
        }
        System.out.println(result);


    }
}