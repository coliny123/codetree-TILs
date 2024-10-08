import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] chairs = new int[N];
        HashSet[] history = new HashSet[N];
        for(int i=0; i<N; i++){
            chairs[i] = i;
            history[i] = new HashSet<>();
            history[i].add(i);
        }

        int[][] commends = new int[2][K];
        for(int i=0; i<K; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            commends[0][i] = a;
            commends[1][i] = b;
        }

        for(int i=0; i<3*K; i++){
            int a = commends[0][i%K];
            int b = commends[1][i%K];

            history[chairs[a]].add(b);
            history[chairs[b]].add(a);

            int tmp = chairs[a];
            chairs[a] = chairs[b];
            chairs[b] = tmp;
        }

        for(HashSet set : history){
            System.out.println(set.size());
        }
    }
}