import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();
        
        int[] nums = new int[3*N];

        for(int i=0; i<3*N; i++){
            nums[i] = sc.nextInt();
        }

        while(T-- > 0){
            int tmp = nums[3*N-1];
            for(int i=3*N-1; i>0; i--){
                nums[i] = nums[i-1];
            }
            nums[0] = tmp;
        }


        for(int i=0; i<3*N; i++){
            System.out.print(nums[i]+" ");
            if(i!=0 && (i+1)%N==0){
                System.out.println();
            }
        }
    }
}