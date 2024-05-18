import java.util.*;

public class Main {
    public static int n;
    public static int m;
    public static int graph[][];
    public static boolean visited[][];
    public static ArrayList<Integer> answer = new ArrayList<>();

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
    

    public static void DFS(int x, int y){
        int dx[] = new int[]{1,0};
        int dy[] = new int[]{0,1};

        for(int i=0; i<2; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(canGo(nx, ny)){
                visited[nx][ny] = true;
                DFS(nx, ny);
            }
        }
    }



    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                graph[i][j] = sc.nextInt();
            }
        }
        visited[0][0]= true;
        DFS(0,0);

        if(visited[n-1][m-1]){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}