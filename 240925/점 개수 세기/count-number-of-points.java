import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();


        int points[] = new int[n+1];
        HashMap<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>();

        for(int i=1; i<=n; i++){
            points[i] = sc.nextInt();
            set.add(points[i]);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int cnt=1;
        for(int point : set){
            map.put(point, cnt);
            cnt++;
            min = Math.min(min, point);
            max = Math.max(max, point);
        }

        for(int i=0; i<q; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();

            int newS=map.get(min);
            int newE=map.get(max);

            if(map.containsKey(s)){
                newS = map.get(s);
            }else{
                for(int key : map.keySet()){
                    if(s <= key){
                        newS = map.get(key);
                        // System.out.println("newS : " + key);
                        break;
                    }
                }
            }

            if(map.containsKey(e)){
                newE = map.get(e);
            }else{
                for(int key : map.keySet()){
                    // System.out.println(key);
                    if(key >= e){
                        newE = map.get(key)-1;
                        // System.out.println("newE : " + key);
                        break;
                    }
                }
            }

            System.out.println(newE - newS+1);
        }
    }
}