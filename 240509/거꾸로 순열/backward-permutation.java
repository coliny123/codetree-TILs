import java.util.*;

public class Main {
    public static int n;
    public static boolean visited[];
    public static ArrayList<Integer> answer = new ArrayList<>();

    public static void print(){
        for(int i=0; i<n; i++){
            System.out.print(answer.get(i) + " ");
        }
        System.out.println();
    }

    public static void choose(int curr_num){
        if(curr_num == n+1){
            print();
            return;
        }

        for(int i=n; i>0; i--){
            if(visited[i]){
                continue;
            }
            answer.add(i);
            visited[i] =true;
            choose(curr_num+1);
            answer.remove(answer.size()-1);
            visited[i] = false;
        }
    }
    

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visited = new boolean[n+1];
       
        choose(1);
    }
}