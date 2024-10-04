import java.util.*;

public class Main {
    public static long M, A, B;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        M = sc.nextLong();
        A = sc.nextLong();
        B = sc.nextLong();
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // System.out.println((long)Math.pow(10, 18)+1);
        for(long i=A; i<=B; i++){
            int result = binarySearch(1, M, i);
            min = Math.min(min, result);
            max = Math.max(max, result);
        }

        System.out.println(min + " " + max);

    }

    public static int binarySearch(long st, long ed, long t){
        int cnt=0;
        while(st <= ed){
            cnt++;
            long mid = (st+ed)/2;

            if(mid == t){
                break;
            }else if(mid < t){
                st = mid +1;
            }else{
                ed = mid -1;
            }
        }

        return cnt;
    }
}
// 1000000000000000001L