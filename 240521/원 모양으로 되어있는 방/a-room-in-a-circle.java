import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n+1];

        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }

        int minWalk = Integer.MAX_VALUE;
        for(int i=1; i<=n; i++){
            int distance = 0;
            int walk=0;
            for(int j=i; j<n+i; j++){
                int idx = j%n;
                if(idx == 0){
                    idx++;
                }
                walk += arr[idx]*distance;
                distance++;
            }
            minWalk = Math.min(minWalk, walk);
        }

        System.out.println(minWalk);
    }
}