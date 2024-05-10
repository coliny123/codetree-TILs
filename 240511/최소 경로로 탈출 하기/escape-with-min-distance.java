import java.util.*;


class Pair{
    int x, y;

    public Pair(int x, int y){
        this.x =x;
        this.y =y;
    }
}
public class Main {
    public static int n;
    public static int m;
    public static int graph[][];
    public static int step[][];
    public static Queue<Pair> q = new LinkedList<>();
    public static boolean visited[][];

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

    public static void push(int x, int y, int c){
        if(canGo(x,y)){
            visited[x][y] = true;
            step[x][y] = c;
            q.add(new Pair(x, y));
        }
    }

    public static void BFS(){
        int dx[] = new int[]{0, -1, 0 ,1};
        int dy[] = new int[]{1, 0, -1, 0};

        while(!q.isEmpty()){
            Pair curPair = q.poll();
            for(int i=0; i<4; i++){
                int nextX = curPair.x + dx[i];
                int nextY = curPair.y + dy[i];
                push(nextX, nextY, step[curPair.x][curPair.y]+1);
            }
        }

    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        visited = new boolean[n][m];
        graph = new int [n][m];
        step = new int [n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                graph[i][j] = sc.nextInt();
            }
        }

        push(0,0,0);
        BFS();

        if(step[n-1][m-1] == 0){
            System.out.println(-1);
        }else{
            System.out.println(step[n-1][m-1]);
        }
    }
}