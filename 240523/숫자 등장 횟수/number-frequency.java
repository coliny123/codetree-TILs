import java.util.*;

public class Main {
    public static int arr[] = new int[100001];
    public static HashMap<Integer, Integer> hm = new HashMap<>();
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++){
            arr[i] =  sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i], 1);
            }else{
                hm.put(arr[i], hm.get(arr[i])+1);
            }
        }


        for(int i=0; i<m; i++){
            int num = sc.nextInt();

            if(!hm.containsKey(num)){
                System.out.print(0 + " ");
            }else{
                System.out.print(hm.get(num) + " ");
            }
        }






    }
}