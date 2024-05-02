import java.util.*;

public class Main {
    public static int n;
    public static int arr[];
    public static int temp[];


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int end = n;
        for(int k=0; k<2; k++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            temp= new int[n];
            int cnt=0;

            s--; e--;
            for(int j=0; j<end; j++){
                if(j>=s && j<=e){
                    continue;
                }
                temp[cnt++] = arr[j];
            }

            for(int j=0; j<cnt; j++){
                arr[j] = temp[j];
            }

            end = cnt;

        }
        System.out.println(end);
        for(int i = 0; i < end; i++)
            System.out.println(arr[i]);
    }
}