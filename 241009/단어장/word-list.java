import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        TreeMap<String, Integer> map = new TreeMap<>();

        sc.nextLine();
        while(N-- > 0){
            String str = sc.nextLine();
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for(String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }
}