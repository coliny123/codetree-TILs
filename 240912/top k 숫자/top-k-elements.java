import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        while(n-- > 0){
            set.add(sc.nextInt());
        }

        while(k-- > 0){
            System.out.print(set.first() + " ");
            set.remove(set.first());
        }
    }
}