import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        while(n-- > 0){
            int num = sc.nextInt();
            set.add(num);
        }

        System.out.println(set.size());
    }
}