import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[] = new int[1000000];
        int B[] = new int[1000000];

        int current = 0;
        int time = 0;
        for(int i=0; i<N; i++){
            String dir = sc.next();
            int t = sc.nextInt();
            for(int j=0; j<t; j++){
                A[time] = current;
                if(dir.equals("R")){
                    current++;
                }else{
                    current--;
                }
                time++;
            }
        }

        current = 0;
        time = 0;
        for(int i=0; i<M; i++){
            String dir = sc.next();
            int t = sc.nextInt();
            for(int j=0; j<t; j++){
                B[time] = current;
                if(dir.equals("R")){
                    current++;
                }else{
                    current--;
                }
                time++;
            }
        }

        int meet = -1;
        for(int i=1; i<time; i++){
            if(A[i] == B[i]){
                meet = i;
                break;
            }
        }
        System.out.println(meet);
        
    }
}