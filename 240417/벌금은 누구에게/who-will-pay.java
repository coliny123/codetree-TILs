import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int penalizedPerson[] = new int[M];
        int penaltyNum[] = new int[N+1];

        for(int i=0; i<M; i++){
            penalizedPerson[i] = sc.nextInt();
        }
        int answer = -1;
        for(int i=0; i<M; i++){
            int target = penalizedPerson[i];
            penaltyNum[target]++;

            if(penaltyNum[target] >= K){
                answer = target;
                break;
            }
        }

        
        System.out.println(answer);
    }
}