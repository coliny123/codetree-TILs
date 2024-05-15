import java.util.*;

class Pair implements Comparable<Pair>{
    int idx,distance;

    public Pair(int idx, int distance){
        this.idx = idx;
        this.distance = distance;
    }

    @Override
    public int compareTo(Pair pair){
        return this.distance - pair.distance;
    }
}


public class Main {

    public static Pair arr[];


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new Pair[n];

        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int absX = Math.abs(0-x);
            int absY = Math.abs(0-y);
            int distance = absX + absY;
            arr[i] = new Pair(i,distance);
        }

        Arrays.sort(arr);


        for(int i=0; i<n; i++){
            System.out.println(arr[i].idx+1);
        }

    }
}