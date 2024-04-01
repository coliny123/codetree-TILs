import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int dirNum = 3;
        int x =0, y=0;
        int [] dx = new int[]{1, 0, -1, 0};
        int [] dy = new int[]{0, -1, 0, 1};
        int nx = 0, ny = 0;

        String s = sc.next();
        char[] arr = new char[s.length()];
        arr = s.toCharArray();

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 'L')
                dirNum = (dirNum - 1 + 4) % 4;
            else if(arr[i] == 'R')
                dirNum = (dirNum + 1) % 4;
            else{
                nx = x + dx[dirNum];
                ny = y + dy[dirNum];
            }
        }
        System.out.println(nx + " " + ny);

    }
}