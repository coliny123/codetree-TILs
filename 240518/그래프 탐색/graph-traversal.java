import java.util.*;

public class Main {
    public static ArrayList<Integer>[] graph;
    public static boolean visited[];
    public static int n;
    public static int m;
    public static int cnt = 0;


    public static void DFS(int v){
        for(int i=0; i<graph[v].size(); i++){
            int currV = graph[v].get(i);
            if(!visited[currV]){
                visited[currV] = true;
                cnt++;
                DFS(currV);
            }
        }


    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i=1; i<=n; i++){
            graph[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<m; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();

            graph[start].add(end);
            graph[end].add(start);
        }

        visited[1] = true;
        DFS(1);

        System.out.println(cnt);



    }
}