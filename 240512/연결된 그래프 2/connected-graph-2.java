import java.util.*;

public class Main {
    public static int n;
    public static int m;
    public static ArrayList<Integer> graph[];
    public static ArrayList<Integer> answer = new ArrayList<>();

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new ArrayList[n+1];

        for(int i=1; i<=n; i++){
            graph[i] = new ArrayList<>();
        }

        while(m-- > 0){
            int start = sc.nextInt();
            int end = sc.nextInt();

            graph[end].add(start);
        }

        int max = -1;
        for(int i=1; i<=n; i++){
            max = Math.max(max, graph[i].size());
        }

        for(int i=1; i<=n; i++){
            if(graph[i].size() == max){
                for(int j=0; j<graph[i].size(); j++){
                    if(!answer.contains(graph[i].get(j))){
                        answer.add(graph[i].get(j));
                    }
                }
            }
        }

        Collections.sort(answer);

        for(int i=0; i<answer.size(); i++){
            System.out.print(answer.get(i) + " ");
        }



    }
}