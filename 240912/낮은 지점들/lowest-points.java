import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        while(n-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            

            if(map.containsKey(x)){
                int value = Math.min(y, map.get(x));
                map.put(x, value);
            }else{
                map.put(x, y);
            }
        }

        int sum=0;
        for(int key:map.keySet()){
            sum += map.get(key);
        }

        System.out.println(sum);
    }
}