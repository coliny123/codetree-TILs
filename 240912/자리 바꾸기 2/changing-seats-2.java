import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int arr[] = new int[N];
        HashSet<Integer> history[] = new HashSet[N];

        int history1[] = new int[K];
        int history2[] = new int[K];

        for(int i=0; i<N; i++){
            arr[i] = i;
            history[i] = new HashSet<>();
            history[i].add(i);
        }

        for(int i=0; i<K; i++){
            history1[i] = sc.nextInt()-1;
            history2[i] = sc.nextInt()-1;
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<K; j++){
                int one = history1[j];
                int two = history2[j];

                int temp = arr[one];   // 0
                arr[one] = arr[two];  // 1
                arr[two] = temp;

                if(!history[arr[one]].contains(one)) {
                    history[arr[one]].add(one);
                }
                
                if(!history[arr[two]].contains(two)) {
                    history[arr[two]].add(two);
                }
            }
        }

        for(HashSet<Integer> set : history){
            System.out.println(set.size());
        }


    }
}