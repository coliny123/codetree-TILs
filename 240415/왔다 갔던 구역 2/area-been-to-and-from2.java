import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [2002];
        int offset = 1000;
        int curr = offset;

        for(int i=0; i<n; i++){
            int x1 = sc.nextInt();
            char dir = sc.next().charAt(0);
            if(dir == 'R'){
                for(int j=curr; j<curr+x1; j++){
                    arr[j]++;
                }
            }else{
                for(int j=curr; j>curr-x1; j--){
                    arr[j]++;
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);

    }
}