import java.util.*;

public class Main {
    public static int n;
    public static int m;

    public static int grid[][];

    public static int seq[];

    public static boolean isHappySequence(){
        int consecutiveCount = 1, maxCcnt=1;
        for(int i=1; i<n; i++){
            if(seq[i-1] == seq[i])
                consecutiveCount++;
            else
                consecutiveCount = 1;

            maxCcnt = Math.max(maxCcnt, consecutiveCount);
        }

        return maxCcnt >= m;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int answer = 0;

        grid = new int[n][n];
        seq = new int[n];
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        for(int i=0; i<n; i++){
            int maxSeqCnt = 1;
            int seqCnt=1;
            for(int j=1; j<n; j++){
                if(grid[i][j-1]==grid[i][j]){
                    seqCnt++;
                }else{
                    seqCnt = 1;
                }
                maxSeqCnt = Math.max(maxSeqCnt, seqCnt);
            }
            if(maxSeqCnt >= m)
                answer++;
        }

        for(int i=0; i<n; i++){
            int maxSeqCnt = 1;
            int seqCnt=1;
            for(int j=1; j<n; j++){
                if(grid[j-1][i] == grid[j][i])
                    seqCnt++;
                else{
                    seqCnt = 1;
                }
                maxSeqCnt = Math.max(maxSeqCnt, seqCnt);
            }
            if(maxSeqCnt >= m)
                answer++;
        }

        System.out.println(answer);

    }
}