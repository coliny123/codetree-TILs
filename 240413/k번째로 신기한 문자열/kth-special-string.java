import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();
        String arr[] = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }

        Arrays.sort(arr);
        int cnt = 0;

        for(int i=0; i<n; i++){
            boolean good = false;
            for(int j=0; j<T.length(); j++){
                if(arr[i].charAt(j) != T.charAt(j)){
                    good = false;
                    break;
                }else{
                    good = true;
                }
            }
            if(good){
                cnt++;
                if(cnt == k){
                    System.out.println(arr[i]);
                }
            }else{
                continue;
            }
        }
    }
}