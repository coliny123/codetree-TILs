import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A[] = new int[1000001];
        int B[] = new int[1000001];

        int time=0;
        for(int i=0; i<n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            while(t-- > 0){
                A[time] += v;
                time++;
            }

        }
        time=0;
        for(int i=0; i<m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            while(t-- > 0){
                B[time] += v;
                time++;
            }
        }

        
        int sundo = 0;
        int answer = 0;
        for(int i=0; i<time; i++){
            if(A[i] > B[i]){
                if(sundo == 2){
                    answer++;
                }
                sundo = 1;
            }
            else if(A[i] < B[i]){
                if(sundo == 1){
                    answer++;
                }
                sundo = 2;
            }
        }

        System.out.print(answer);
    }
}