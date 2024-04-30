import java.util.*;


public class Main {

    public static boolean inRange(int x, int y, int n){
        return(0<=x && x<n && 0<=y && y<n);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int dx[] = new int[]{0, 1, 0, -1};
        int dy[] = new int[]{1, 0, -1, 0};

        int n = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;
        char d = sc.next().charAt(0);

        int dir = 0;
        if(d == 'U'){
            dir = 0;
        }else if(d == 'D'){
            dir = 2;
        }else if(d == 'L'){
            dir = 3;
        }else{
            dir = 1;
        }


        for(int i=0; i<t; i++){
            int nx = r + dx[dir];
            int ny = c + dy[dir];
            if(inRange(nx, ny, n)){
                r = nx;
                c = ny;
            }else{
                dir = (dir + 2) % 4;
            }
        }

        System.out.print((c+1) + " " +(r+1));
        
    }
}