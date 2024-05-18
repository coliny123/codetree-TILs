import java.util.*;



public class Main {
    public static int n;
    public static int m;
    public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;
    public static int cnt;
    public static int graph[][];
    public static int answer[];
    public static boolean visited[][];
    public static ArrayList<Integer> vilage = new ArrayList<>();

    public static void print(){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(visited[i][j]);
            }
            System.out.println();
        }
        
    }

    public static void reset(){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                visited[i][j] = false;
            }
        }
    }

    public static boolean inRange(int x, int y){
        return (0<=x && x<n && 0<=y && y<m);
    }

    public static boolean canGo(int x, int y, int k){
        if(!inRange(x, y)){
            return false;
        }

        if(visited[x][y] || graph[x][y] <= k){
            return false;
        }

        return true;
    }


    public static void DFS(int x, int y, int k){
        int dx[] = new int[]{1,0,-1,0};
        int dy[] = new int[]{0,-1,0,1};

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(canGo(nx, ny, k)){
                visited[nx][ny] = true;
                DFS(nx, ny, k);
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
                int a = sc.nextInt();
                graph[i][j] = a;
                max = Math.max(max, a);
                min = Math.min(min, a);
            }
        }

        answer = new int[max+1];

        for(int k=1; k<=max; k++){
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(canGo(i, j, k)){
                        visited[i][j] = true;
                        DFS(i, j, k);
                        vilage.add(1);
                    }
                }
            }
            answer[k] = vilage.size();
            vilage.clear();
            // System.out.println(k);
            // print();
            // for(int i=0; i<answer.length; i++){
            //     System.out.print(answer[i] + " ");
            // }
            // System.out.println();
            reset();
        }

        int maxVilage = answer[1];
        int idx = 1;
        for(int k=2; k<=max; k++){
            if(answer[k] > maxVilage){
                maxVilage = answer[k];
                idx = k;
            }
        }

        System.out.println(idx + " " + maxVilage);
    }
}