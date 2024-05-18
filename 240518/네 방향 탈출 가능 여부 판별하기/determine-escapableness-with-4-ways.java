import java.util.*;

class Pair{
    int x, y;
    public Pair(int x, int y){
        this.x = x;
        this.y =y;
    }
}

public class Main {
    public static int n;
    public static int m;
    public static Queue<Pair> q = new LinkedList<>();
    public static int grid[][];
    public static boolean visited[][];

    public static boolean inRange(int x, int y){
        return (0<=x && x<n && 0<=y && y<m);
    }

    public static boolean canGo(int x, int y){
        if(!inRange(x, y)){
            return false;
        }

        if(visited[x][y] || grid[x][y] == 0){
            return false;
        }

        return true;
    }


    public static void push(int x, int y){
        if(canGo(x, y)){
            visited[x][y] = true;
            q.add(new Pair(x, y));
        }
    }

    public static void BFS(){
        int dx[] = new int[]{1,0,-1,0};
        int dy[] = new int[]{0,1,0,-1};

        while(!q.isEmpty()){
            Pair curPair = q.poll();
            for(int i=0; i<4; i++){
                int nx = curPair.x + dx[i];
                int ny = curPair.y + dy[i];

                push(nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        grid = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        push(0,0);
        BFS();

        if(visited[n-1][m-1]){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}