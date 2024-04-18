import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A[] = new int[1000001];
        int B[] = new int[1000001];

        int timeA = 1;
        for(int i=0; i<n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            while(t-- > 0){
                A[timeA] = A[timeA - 1] + v;
                timeA++;
            }
        }

        int timeB = 1;
        for(int i=0; i<m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            while(t-- > 0){
                B[timeB] = B[timeB - 1] + v;
                timeB++;
            }
        }
        int max = Math.max(timeA, timeB);



        int sundo = 0, answer = 0;
        for(int i = 1; i <max; i++) {
            if(A[i] > B[i]) {
                if(sundo != 1)
                    answer++;
                sundo = 1; 
            }
            else if(A[i] < B[i]) {
                if(sundo != 2)
                    answer++;
                sundo = 2; 
            }
            else{
                if(sundo != 0){
                    answer++;
                }
                sundo = 0;
            }
        }

        System.out.println(answer);
    }
}