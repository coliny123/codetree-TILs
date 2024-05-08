import java.util.*;

public class Main {
    public static int n;
    public static int m;
    public static int cnt = 0;
    public static ArrayList<Integer>[] graph;
    public static boolean visited[];

    public static void DFS(int vertex){
        for(int i=0; i<graph[vertex].size(); i++){
            int currV = graph[vertex].get(i);
            if(!visited[currV]){
                cnt++;
                visited[currV] = true;
                DFS(currV);
            }
        }
    }


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph= new ArrayList[n];
        visited = new boolean[n];

        for(int i=0; i<n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<m; i++){
            int start = sc.nextInt() -1;
            int end = sc.nextInt() -1;

            graph[start].add(end);
            graph[end].add(start);
        }

        int rootVertex = 0;
        visited[rootVertex] = true;
        DFS(rootVertex);

        System.out.println(cnt);
    }
}