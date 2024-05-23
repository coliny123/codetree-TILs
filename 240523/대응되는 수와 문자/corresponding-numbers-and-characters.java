import java.util.*;

public class Main {
    public static HashMap<String, Integer> strHm = new HashMap<>();
    public static HashMap<Integer, String> intHm = new HashMap<>();
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=1; i<=n; i++){
            String a = sc.next();
            strHm.put(a, i);
            intHm.put(i, a);
        }

        for(int i=0; i<m; i++){
            String key = sc.next();
            if('0' <= key.charAt(0) && key.charAt(0) <= '9'){
                int intKey = Integer.parseInt(key);
                System.out.println(intHm.get(intKey));
            }else{
                System.out.println(strHm.get(key));
            }
        }

    }
}