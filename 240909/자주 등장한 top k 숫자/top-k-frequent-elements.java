import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            map.put(a, map.getOrDefault(a, 0) + 1);
        }


        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, new Comparator<Integer>(){
            @Override
            public int compare(Integer k1, Integer k2){
                int v1 = map.get(k1);
                int v2 = map.get(k2);
                if(v1 == v2){
                    return k2 - k1;
                }else{
                    return v2 - v1;
                }
            }
        });

        for(int i=0; i<K; i++){
            System.out.print(keys.get(i)+" ");
        }

    }
}