import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i=0; i<3; i++){
            char a = sc.next().charAt(0);
            int b = sc.nextInt();
            if(a=='Y' && b>=37){
                arr[0] += 1;
            }else if(a=='N' && b>=37){
                arr[1] += 1;
            }else if(a=='Y' && b<37){
                arr[2] += 1;
            }else{
                arr[3] += 1;
            }
        }

        for(int j=0; j<arr.length; j++){
            System.out.printf("%d ", arr[j]);
        }
        if(arr[0]>=2){
            System.out.print("E");
        }

    }
}