import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int totalLen = 2*n;

        int arr[] = new int[totalLen];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=n; i<totalLen; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while(t-- >0){
            int temp = arr[totalLen-1];
            for(int i=totalLen-1; i>0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=n; i<n*2; i++){
            System.out.print(arr[i] + " ");
        }


    }
}