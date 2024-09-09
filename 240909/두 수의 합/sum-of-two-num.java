import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static final int MAX_N = 100000;
    
    // 변수 선언
    public static int n, k;
    public static int[] arr = new int[MAX_N];
    public static HashMap<Integer, Integer> count = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력:
        n = sc.nextInt();
        k = sc.nextInt();

        // 바로 HashMap에 저장하지 않은 이유는 중복 count를 방지하기 위함
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int ans = 0;


        for(int i = 0; i < n; i++) {
            int diff = k - arr[i];
            // (4,5)->노카운트 (5,4)->카운트 : 중복 count 방지 위함
            // 굳이 처음부터 5C2 같은 조합을 생각할 필요 없음
            if(count.containsKey(diff))
                ans += count.get(diff);

            // 현재 숫자의 개수를 하나 증가시켜줍니다.
            // {3, 3, 3, 3, 3} 의 경우
            // [0, 1, 2, 3, 4]로 같은 숫자 갯수를 HashMap으로 저장
            count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print(ans);
    }
}