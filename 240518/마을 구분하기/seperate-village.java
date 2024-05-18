import java.util.*;

public class Main {
    public static int n;
    public static int cnt;
    public static int graph[][];
    public static boolean visited[][];
    public static ArrayList<Integer> answer = new ArrayList<>();


    public static boolean inRange(int x, int y){
        return (0<=x && x<n && 0<=y && y<n);
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
        int dx[] = new int[]{1,0,-1,0};
        int dy[] = new int[]{0,-1,0,1};

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(canGo(nx, ny)){
                cnt++;
                visited[nx][ny] = true;
                DFS(nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        graph = new int[n][n];
        visited = new boolean[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                graph[i][j] = sc.nextInt();
            }
        }


        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(canGo(i, j)){
                    visited[i][j] = true;
                    cnt = 1;
                    DFS(i, j);
                    answer.add(cnt);
                }
            }
        }

        Collections.sort(answer);
        System.out.println(answer.size());
        for(int i=0; i<answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }
}