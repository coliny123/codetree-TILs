import java.util.*;

public class Main{

    public static int n;
    public static int m;
    public static boolean visited[][];
    public static int graph[][];

    public static boolean inRange(int x, int y){
        return (0<=x && x<n && 0<=y && y<m);
    }

    public static boolean canGo(int x, int y){
        if(!inRange(x, y)){
            return false;
        }

        if(visited[x][y] || graph[x][y] == 0){
            return false;
        }

        return true;
    }

    public static void DFS(int currX, int currY){
        int dx[] = new int[]{1, 0};
        int dy[] = new int[]{0, 1};
        for(int i=0; i<2; i++){
            int nextX = currX + dx[i];
            int nextY = currY + dy[i];
            if(canGo(nextX, nextY)){
                visited[nextX][nextY] = true;
                DFS(nextX, nextY);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visited = new boolean[n][m];
        graph = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                graph[i][j] = sc.nextInt();
            }
        }

        visited[0][0] =true;
        DFS(0, 0);

        if(visited[n-1][m-1]){
            System.out.println(1);
        }else{
            System.out.println(0);
        }


    }
}