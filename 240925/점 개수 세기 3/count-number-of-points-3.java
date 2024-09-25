import java.util.*;

class Pair {
    int a, b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> nums = new TreeSet<>();

        int arr[] = new int[100000];
        Pair queries[] = new Pair[100000];


        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<q; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            queries[i] = new Pair(a, b);
        }

        for(int i=0; i<n; i++){
            nums.add(arr[i]);
        }

        int cnt = 1;
        for(Integer num : nums){
            // System.out.println(num + " " + cnt);
            map.put(num, cnt);
            cnt++;
        }

        for(int i = 0; i < q; i++) {
            int a = queries[i].a;
            int b = queries[i].b;
            int newA = map.get(a);
            int newB = map.get(b);
            // System.out.println("a : " + a + " newA : " + newA + " B : " + b + " newB : " + newB);

            System.out.println(newB - newA + 1);
        }
    }
}