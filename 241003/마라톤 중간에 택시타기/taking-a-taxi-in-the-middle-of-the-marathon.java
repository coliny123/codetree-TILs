import java.util.*;



public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] Xs = new int[N];
        int[] Ys = new int[N];
        int[] L = new int[N];
        int[] R = new int[N];

        for(int i=0; i<N; i++){
            Xs[i] = sc.nextInt();
            Ys[i] = sc.nextInt();
        }

        for(int i=1; i<N; i++){
            L[i] = L[i-1] + Math.abs(Xs[i-1] - Xs[i]) + Math.abs(Ys[i-1] - Ys[i]);
            R[N-i-1] = R[N-i] + Math.abs(Xs[N-i-1] - Xs[N-i]) + Math.abs(Ys[N-i-1] - Ys[N-i]);
            
        }

        int min=Integer.MAX_VALUE;
        for(int i=1; i<N-1; i++){
            int distance = L[i-1] + R[i+1] + Math.abs(Xs[i+1] - Xs[i-1]) + Math.abs(Ys[i+1] - Ys[i-1]);
            min = Math.min(min, distance);
        }

        System.out.println(min);

        
    }
}