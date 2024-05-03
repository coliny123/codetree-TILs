import java.util.*;

public class Main {
    public static int n;
    public static int currX;
    public static int currY;
    public static int arr[][];
    public static int dx[] = new int[]{-1, 1, 0, 0};
    public static int dy[] = new int[]{0, 0, -1, 1};

    public static boolean inRange(int x, int y){
        return(0<=x && x<n && 0<=y && y<n);
    }
    public static ArrayList<Integer> visitedNums = new ArrayList<>();

    public static boolean simulate(){
        for(int i=0; i<4; i++){
            int nx = currX + dx[i];
            int ny = currY + dy[i];

            if(inRange(nx, ny) && arr[nx][ny] > arr[currX][currY]){
                currX = nx;
                currY = ny;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        currX = sc.nextInt();
        currY = sc.nextInt();
        arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        currX--; currY--;

        visitedNums.add(arr[currX][currY]);
        while(true){
            boolean greaterNumberExist = simulate();
            if(!greaterNumberExist){
                break;
            }
            visitedNums.add(arr[currX][currY]);
        }

        for(int i = 0; i < visitedNums.size(); i++)
            System.out.print(visitedNums.get(i) + " ");
    }
}