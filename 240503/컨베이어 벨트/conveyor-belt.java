import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int u[] = new int[n];
        int d[] = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            u[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            d[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<t; i++){
            int temp = u[n-1];
            for(int col=n-1; col>0; col--){
                u[col] = u[col-1];
            }
            u[0] = d[n-1];

            for(int col=n-1; col>0; col--){
                d[col] = d[col-1];
            }
            d[0] = temp;
        }


        for(int i=0; i<n; i++){
            System.out.print(u[i] + " ");
        }
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(d[i] + " ");
        }


    }
}