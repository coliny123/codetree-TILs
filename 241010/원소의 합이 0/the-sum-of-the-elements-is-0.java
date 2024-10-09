import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] nums = new int[4][N];

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<4; i++){
            for(int j=0; j<N; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++) {
                int key = nums[0][i] + nums[1][j];
                map.put(key, map.getOrDefault(key, 0) + 1); // map을 쓰는 이유 : A[i] + B[j] 가 같은 조합이 여러개 나올 수 있기 때문에 그 것을 카운트해야됨
            }
        } 

        int ans=0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++) {
                int diff = - nums[2][i] - nums[3][j];
                if(map.getOrDefault(diff, 0) > 0)  // map에 -(C[i] + D[j])가 존재하는지 체크, 없으면 0을 리턴 -> 0이면 패스
                    ans += map.get(diff);
            }
        }

        System.out.println(ans);
        
    }
}