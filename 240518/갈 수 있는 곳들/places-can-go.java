import java.util.*;

class Pair{
    int x, y;

    public Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}

public class Main {
    public static int n;
    public static int k;
    public static int cnt = 0;
    public static int grid[][];
    public static boolean visited[][];
    public static Queue<Pair> q = new LinkedList<>();
    public static ArrayList<Integer> answer = new ArrayList<>();

    public static boolean inRange(int x, int y){
        return (0<=x && x<n && 0<=y && y<n);
    }

    public static boolean canGo(int x, int y){
        return (inRange(x, y) && !visited[x][y] && grid[x][y] == 0);
    }


    public static void push(int x, int y){
        if(canGo(x, y)){
            cnt++;
            visited[x][y] = true;
            q.add(new Pair(x, y));
        }
    }

    public static void BFS(){
        int dx[] = new int[]{0,-1,0,1};
        int dy[] = new int[]{-1,0,1,0};

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
        k = sc.nextInt();

        grid = new int[n][n];
        visited = new boolean[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        while(k-- > 0){
            int r = sc.nextInt();
            int c = sc.nextInt();

            r--;
            c--;

            push(r, c);
            BFS();
        }
        System.out.println(cnt);
    }
}