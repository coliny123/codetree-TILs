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

    public static void DFS(int currX, int currY){
        int dx[] = new int[]{1, 0, -1, 0};
        int dy[] = new int[]{0, 1, 0, -1};

        for(int i=0; i<4; i++){
            int nextX = currX + dx[i];
            int nextY = currY + dy[i];
            if(canGo(nextX, nextY)){
                cnt++;
                visited[nextX][nextY] = true;
                DFS(nextX, nextY);
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
                cnt = 0;
                if(canGo(i, j)){
                    cnt++;
                    visited[i][j] = true;
                    DFS(i,j);
                    if(cnt != 0){
                        answer.add(cnt);
                    }
                }
            }
        }

        System.out.println(answer.size());
        Collections.sort(answer);
        for(int i=0; i<answer.size(); i++){
            System.out.println(answer.get(i));
        }

    }
}