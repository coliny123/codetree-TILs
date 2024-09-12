import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        HashMap<String, Integer> map = new HashMap<>();

        while(n-- > 0){
            String str = sc.nextLine();
            char strArr[] = str.toCharArray();
            Arrays.sort(strArr);
            str = new String(strArr);

            map.put(str, map.getOrDefault(str, 0)+1);
        }

        int max=0;
        for(String key : map.keySet()){
            max = Math.max(max, map.get(key));
        }

        System.out.println(max);


    }
}