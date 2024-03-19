import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[]arr = new int[n+1];    // 0, 0, 0, 0, 0
        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();  // 0, 1, 8, 5, 5
        }
        for(int j=0; j<q; j++){
            int c = sc.nextInt();
            int a = sc.nextInt();
            if(c==1){
                System.out.println(arr[a]);
            }else if(c==2){
                int idx = -1;
                for(int k=1; k<arr.length; k++){
                    if(arr[k]==a){
                        if(idx == -1){
                            idx = k;
                        }
                    }
                }
                if(idx == -1){
                    System.out.println(0);
                }else{
                    System.out.println(idx);
                }
            }else{
                int b = sc.nextInt();
                for(int z=a; z<=b; z++){
                    System.out.printf("%d ", arr[z]);
                }
                System.out.println();
            }
        }

    }
}