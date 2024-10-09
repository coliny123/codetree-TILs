import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] nums = new int[4][N];

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<4; i++){
            for(int j=0; j<N; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                int key = nums[0][i] + nums[1][j];
                set.add(key);
            }
        }

        int cnt = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                int remain = -(nums[2][i] + nums[3][j]);
                if(set.contains(remain)){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        
    }
}