import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[]arr = new String[10];
        int[]arrInt = new int[10];

        for(int i=0; i<10; i++){
            arr[i] = sc.next();
        }

        char n = sc.next().charAt(0);

        boolean exists = false;

        for(int i=0; i<10; i++){
            int len = arr[i].length();
            if(arr[i].charAt(len-1) == n){
                arrInt[i] = 1;
                exists = true;
            }
        }

        if(exists){
            for(int i=0; i<10; i++){
                if(arrInt[i] == 1){
                    System.out.println(arr[i]);
                }
            }
        }else{
            System.out.println("None");
        }
    }
}