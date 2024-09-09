import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        HashMap<Integer, Integer> map = new HashMap<>();

        int N = sc.nextInt();
        int K = sc.nextInt();

        int nums[] = new int[N];

        for(int i=0; i<N; i++){
            nums[i] = sc.nextInt();
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int ans=0;
        for(int i=0; i<N; i++){
            map.put(nums[i], map.get(nums[i])-1);

            for(int j=0; j<i; j++){
                if(map.containsKey(K - nums[i] - nums[j])){
                    ans += map.get(K - nums[i] - nums[j]);
                }
            }
        }

        System.out.println(ans);

    }
}