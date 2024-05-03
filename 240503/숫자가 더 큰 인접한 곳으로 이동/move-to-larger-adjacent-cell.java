import java.util.*;

public class Main {
    public static int n;
    public static int arr[][];
    public static int dx[] = new int[]{0, 0, -1, 1};
    public static int dy[] = new int[]{1, -1, 0, 0};

    public static boolean inRange(int x, int y){
        return(0<=x && x<n && 0<=y && y<n);
    }
    public static class Pair{
        int x, y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void go(Pair pair){

    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        r--; c--;

        Pair maxPair = new Pair(r, c);
        int max = arr[r][c];
        System.out.print(max + " ");
        while(true){
            int beforeMax = max;
            for(int i=0; i<4; i++){
                int nx = r + dx[i];
                int ny = c + dy[i];
                if(inRange(nx, ny) && arr[nx][ny] > beforeMax){
                    max = arr[nx][ny];
                    maxPair.x = nx;
                    maxPair.y = ny;
                }
            }
            r = maxPair.x;
            c = maxPair.y;
            if(beforeMax == max){
                break;
            }
            System.out.print(max + " ");
        }
    }
}