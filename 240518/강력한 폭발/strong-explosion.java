import java.util.*;

class Pair{
    int x,y;
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static int n;
    public static int max=Integer.MIN_VALUE;
    public static int bomb[][];
    public static boolean bombed[][];
    public static ArrayList<Integer> answer = new ArrayList<>();
    public static ArrayList<Pair> bombPos = new ArrayList<>();
    public static Pair bombTypes[][] = new Pair[][]{
        {},
        {new Pair(-2,0), new Pair(-1,0), new Pair(0,0), new Pair(1,0), new Pair(2,0)},
        {new Pair(-1,0), new Pair(1,0), new Pair(0,0), new Pair(0,1), new Pair(0,-1)},
        {new Pair(-1,-1), new Pair(1,1), new Pair(0,0), new Pair(1,-1), new Pair(-1,1)}
    };

    public static boolean inRange(int x, int y){
        return (0<=x && x<n && 0<=y && y<n);
    }

    public static void check(int type, Pair position){
        for(int i=0; i<5; i++){
            Pair nextPair = bombTypes[type][i];
            int nx = position.x + nextPair.x;
            int ny = position.y + nextPair.y;
            // System.out.println("nx : " + nx + " ny : " + ny);
            if(inRange(nx, ny)){
                bombed[nx][ny] = true;
            }
        }
        // System.out.println("finish");
    }

    public static int findMax(){
        // 초기화
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                bombed[i][j] = false;
            }
        }
        int cnt = 0;

        // 넣기
        for(int i=0; i<bombPos.size(); i++){
            int bombType = answer.get(i);
            Pair bombPosition = bombPos.get(i);
            // System.out.println("bombType : " + bombType + " bombPos : (" + bombPosition.x + " " + bombPosition.y + ")");
            check(bombType, bombPosition);
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(bombed[i][j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }


    public static void BT(int idx){
        if(idx == n+1){
            max = Math.max(max, findMax());
            return;
        }

        for(int i=1; i<=3; i++){
            answer.add(i);
            BT(idx+1);
            answer.remove(answer.size()-1);
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        bomb = new int[n][n];
        bombed = new boolean[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int a = sc.nextInt();
                if(a == 1){
                    bombPos.add(new Pair(i, j));
                }
                bomb[i][j] = a;
            }
        }

        BT(1);

        System.out.println(max);

    }
}