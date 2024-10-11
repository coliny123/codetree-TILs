import java.util.*;

public class Main {
    public static int N, M;
    public static int[][] grid;
    public static boolean[][] visited;
    public static int max = Integer.MIN_VALUE;
    public static int[] dx = {0,0,-1,1};
    public static int[] dy = {-1,1,0,0};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        grid = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                visited[i][j] = true;
                DFS(0, 0, i, j);
                visited[i][j] = false;
            }
        }

        System.out.println(max);

    }

    public static void DFS(int cnt, int sum, int x, int y){
        if(cnt == 3){
            max = Math.max(max, sum);
            return;
        }

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(canGo(nx, ny)){
                visited[nx][ny]=true;
                DFS(cnt+1, sum+grid[nx][ny], nx, ny);
                visited[nx][ny]=false;
            }
        }
        
    }

    public static boolean inRange(int x, int y){
        return (0<=x && x<N && 0<=y && y<M);
    }

    public static boolean canGo(int x, int y){
        if(!inRange(x, y)) return false;
        if(visited[x][y]) return false;
        return true;
    }
}