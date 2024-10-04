import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[]nums = new int[N];

        for(int i=0; i<N; i++){
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        while(M-- > 0){
            int t = sc.nextInt();
            int result = Arrays.binarySearch(nums, t);
            if(result > -1){
                System.out.println(result+1);
            }else{
                System.out.println(-1);
            }
        }
    }
}