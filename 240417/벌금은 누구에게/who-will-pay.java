import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int arr[] = new int[N+1];

        int answer = -1;

        for(int i=0; i<M; i++){
            int a = sc.nextInt();
            arr[a]++;
            for(int j=1; j<N+1; j++){
                if(arr[j] == K){
                    answer = j;
                    break;
                }
            }
            if(answer != -1){
                break;
            }
        }
        
        System.out.println(answer);
    }
}