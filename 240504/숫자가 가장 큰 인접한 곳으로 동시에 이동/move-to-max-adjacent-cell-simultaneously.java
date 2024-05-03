import java.util.*;

public class Main {
    public static int n;
    public static int m;
    public static int t;

    public static int arr[][];
    public static int count[][];
    public static int newCount[][];

    public static int dx[] = new int[]{-1, 1, 0, 0};
    public static int dy[] = new int[]{0, 0, -1, 1};

    public static boolean inRange(int x, int y){
        return(0<=x && x<n && 0<=y && y<n);
    }


    public static void move(int row, int col){
        int max = arr[row][col];
        int max_X = row;
        int max_Y = col;
        count[row][col]--;
        for(int i=0; i<4; i++){
            int nx = row + dx[i];
            int ny = col + dy[i];
            if(inRange(nx, ny) && arr[nx][ny] > max){
                max = arr[nx][ny];
                max_X = nx;
                max_Y = ny;
            }
        }
        newCount[max_X][max_Y]++;
    }

    public static void moveAll(){
        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                newCount[row][col] = 0;
            }
        }
        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                if(count[row][col] == 1){
                    move(row, col);
                }
            }
        }

        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                count[row][col] = newCount[row][col];
            }
        }
    }

    public static void removeDuplicate(){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(count[i][j] >= 2){
                    count[i][j] = 0;
                }
            }
        }
    }

    public static void simulate(){
        moveAll();

        removeDuplicate();
    }


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        t = sc.nextInt();

        arr = new int [n][n];
        count = new int [n][n];
        newCount = new int [n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            x--; y--;
            count[x][y] = 1;
        }

        while(t-- > 0){
            simulate();
        }

        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                cnt += count[i][j];
            }
        }

        System.out.println(cnt);

    }
}