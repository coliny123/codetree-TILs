import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        String[] arr = new String[]{"apple", "banana", "grape", "blueberry", "orange"};
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=2; j<4; j++){
                if(arr[i].charAt(j) == a){
                    cnt++;
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
        System.out.println(cnt);

    }
}