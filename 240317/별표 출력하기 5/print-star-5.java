import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        for(int i=0; i<n; i++){
            for(int j=0; j<a; j++){
                for(int k=0; k<a; k++){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            a--;
            System.out.println();
        }
    }
}