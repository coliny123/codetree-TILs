import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int arr2d[][] = new int[2][n];

        for(int i=0; i<2; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr2d[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<t; i++){
            int temp1 = arr2d[0][n-1];
            for(int col=n-1; col>0; col--){
                arr2d[0][col] = arr2d[0][col-1];
            }
            int temp2 = arr2d[1][n-1];
            for(int col=n-1; col>0; col--){
                arr2d[1][col] = arr2d[1][col-1];
            }
            arr2d[0][0] = temp2;
            arr2d[1][0] = temp1;
        }


        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }



    }
}