import java.util.Scanner;

public class Main {
    public static int dirNum = 0;
    public static int x = 0, y = 0;
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static boolean inRange(int x, int y, int n, int m){
        return (0<=x && x<n && 0<=y && y<m);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][]arr2d = new int[n][m];
        arr2d[x][y] = 1;

        for(int i=2; i<=n*m; i++){
            int nx = x + dx[dirNum], ny = y + dy[dirNum];

            if(!inRange(nx, ny, n, m) || arr2d[nx][ny] != 0)
                dirNum = (dirNum + 1) % 4;

            x = x + dx[dirNum]; y = y + dy[dirNum];
            arr2d[x][y] = i;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr2d[i][j]+ " ");
            }
            System.out.println();
        }
    }
}