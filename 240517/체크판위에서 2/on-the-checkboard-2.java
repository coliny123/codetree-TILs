import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int grid[][] = new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                grid[i][j] = sc.next().charAt(0);
            }
        }

        int x = 0;
        int y = 0;
        int cnt = 0;
        for(int row=1; row<r-2; row++){
            for(int col=1; col<c-2; col++){
                if(grid[row][col] != grid[x][y]){
                    for(int row2=row+1; row2<r-1; row2++){
                        for(int col2=col+1; col2<c-1; col2++){
                            if(grid[row2][col2] != grid[row][col] && grid[row2][col2] != grid[r-1][c-1]){
                                cnt++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}