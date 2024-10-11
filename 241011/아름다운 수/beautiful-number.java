import java.util.*;

public class Main {
    public static int N;
    public static int[] nums;
    public static int cnt=0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        nums = new int[N];


        BT(0);

        System.out.println(cnt);

    }

    public static boolean check(){
        for(int i=0; i<N; i += nums[i]){
            if(i + nums[i]-1 >= N)
                return false;
            
            for(int j=i; j<i+nums[i]; j++){
                if(nums[i] != nums[j])
                    return false;
            }
        }
        return true;
    }

    public static void BT(int depth){
        if(depth == N){
            if(check()){
                cnt++;
            }
            return;
        }

        for(int i=1; i<=4; i++){
            nums[depth] = i;
            BT(depth+1);
        }


    }
}