import java.util.Scanner;

public class Main {

    public static boolean inRange(int r, int c, int n){
        return(0<=r && r<n && 0<=c && c<n);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int [] dx = new int[]{0, 1, -1, 0};
        int [] dy = new int[]{1, 0, 0, -1};
        int[][]arr2d = new int[n][n];

        int r = sc.nextInt();
        int c = sc.nextInt();
        char d = sc.next().charAt(0);
        int dir = 0;

        if(d == 'U'){
            dir = 2;
        }else if(d == 'D'){
            dir = 1;
        }else if(d == 'R'){
            dir = 0;
        }else{
            dir = 3;
        }

        r -= 1;
        c -= 1;

        for(int i=0; i<t; i++){
            if(inRange(r + dx[dir],c + dy[dir],n)){
                r = r + dx[dir];
                c = c + dy[dir];
            }else{
                dir = 3 - dir;
            }

        }
        System.out.print((r+1) + " " +(c+1));


    }
}