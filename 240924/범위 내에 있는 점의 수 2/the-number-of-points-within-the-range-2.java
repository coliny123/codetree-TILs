import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        int num[] = new int[1000001];
        int sum[] = new int[1000001];

        for(int i=0; i<N; i++){
            num[sc.nextInt()] = 1;
        }



        for(int i=1; i<sum.length; i++){
            sum[i] = sum[i-1] + num[i];
        }

        while(Q-- > 0){
            int s = sc.nextInt();
            int e = sc.nextInt();
            
            System.out.println(sum[e] - sum[s] + num[s]);
        }
    }
}