import java.util.Scanner;

public class Main {
    public static int n;
    public static int t;

    public static int dx[] = new int[]{0, -1, 0, 1};
    public static int dy[] = new int[]{1, 0, -1, 0};

    public static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();

        int r = sc.nextInt() -1;
        int c = sc.nextInt() -1;
        char d = sc.next().charAt(0);

        int dir = 0;
        if(d == 'U'){
            dir = 3;
        }else if(d == 'L'){
            dir = 2;
        }else if(d == 'D'){
            dir = 1;
        }else{
            dir = 0;
        }

        while(t-- >0){
            int nx = r + dx[dir];
            int ny = c + dy[dir];
            if(inRange(nx, ny)){
                r = nx;
                c = ny;
            }else{
                dir = (dir + 2) % 4;
            }
        }
        System.out.println((r+1) + " " + (c+1));
        
    }
}