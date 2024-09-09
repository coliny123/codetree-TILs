import java.util.*;

public class Main {
    public static HashMap<Integer, Integer> hm = new HashMap<>();

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i=0; i<n; i++){
            hm.put(sc.nextInt(), 1);
        }

        int ans=0;
        for(int key:hm.keySet()){
            int diff = k - key;
            if(hm.containsKey(diff)){
                ans++;
            }
        }

        System.out.println(ans/2);

    }
}