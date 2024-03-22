import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        int[]countArr = new int[1000];
        int result = -1;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            countArr[arr[i]] += 1;
        }

        for(int i=0; i<countArr.length; i++){
            if(countArr[i] == 1){
                result = i;
            }
        }

        System.out.println(result);

    }
}