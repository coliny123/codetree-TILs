import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[2*n];
        int sum[] = new int[n];

        for(int i=0; i<2*n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int lt = 0;
        int rt = 2*n-1;
        int idx=0;
        while(lt<rt){

            sum[idx] = arr[lt]+arr[rt];
            lt++;
            rt--;
            idx++;
            if(lt >= rt){
                break;
            }
        }

        Arrays.sort(sum);

        System.out.println(sum[n-1]);


    }
}