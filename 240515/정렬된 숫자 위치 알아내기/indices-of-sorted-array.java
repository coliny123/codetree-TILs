import java.util.*;

class Pair{
    int idx1, idx2, num;

    public Pair(int idx1, int idx2, int num){
        this.idx1 = idx1;
        this.idx2 = idx2;
        this.num = num;
    }
}

public class Main {

    public static Pair pairArr[];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pairArr = new Pair[n];

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            pairArr[i] = new Pair(i, 0,num);
        }

        Arrays.sort(pairArr, (a,b) -> a.num - b.num);

        for(int i=0; i<n; i++){
            pairArr[i].idx2 = i;
        }

        Arrays.sort(pairArr, (a,b) -> a.idx1 - b.idx1);
        for(int i=0; i<n; i++){
            System.out.print(pairArr[i].idx2+1 + " ");
        }

    }
}