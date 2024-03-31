import java.util.Scanner;

public class Main {

    public static int[] dx = new int[]{1, -1, 0, 0};
    public static int[] dy = new int[]{0, 0, -1, 1};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;

        while(n-- > 0){
            char cDir = sc.next().charAt(0);
            int dist = sc.nextInt();

            int dir;
            if(cDir =='E'){
                dir = 0;
            }else if(cDir == 'W'){
                dir = 1;
            }else if(cDir == 'S'){
                dir = 2;
            }else{
                dir = 3;
            }

            x += dx[dir] * dist;
            y += dy[dir] * dist;

        }
        System.out.print(x + " " + y);
    }
}