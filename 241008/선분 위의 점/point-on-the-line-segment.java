import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] nums = new int[N];

        for(int i=0; i<N; i++){
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        while(M-- > 0){
            int st = sc.nextInt();
            int ed = sc.nextInt();


            int newSt = getLowerBound(nums, 0, nums.length, st);
            int newEd = getUpperBound(nums, 0, nums.length, ed);
            System.out.println(newEd - newSt);
        }

    }

    public static int getUpperBound(int[] arr, int st, int ed, int t){
        int answer=ed--;
        while(st <= ed){
            int mid = (st+ed+1) / 2;

            if(arr[mid] <= t){
                st = mid +1;
            }else{
                ed = mid -1;
                answer = Math.min(answer, mid);
            }
        }

        return answer;
    }

    public static int getLowerBound(int[] arr, int st, int ed, int t){
        int answer=ed--;
        while(st <= ed){
            int mid = (st+ed+1) / 2;

            if(arr[mid] < t){
                st = mid + 1;
            }else{
                ed = mid - 1;
                answer = Math.min(answer, mid);
            }
        }

        return answer;
    }
}