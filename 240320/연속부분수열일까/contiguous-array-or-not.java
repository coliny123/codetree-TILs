import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[]arr1 = new int[n1];
        int[]arr2 = new int[n2];
        boolean isPart = false;

        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        for(int i=0; i<arr1.length; i++){
            if(isPart == false){
                if(arr1[i] == arr2[0] && (i+arr2.length)<=arr1.length){
                    for(int j=0; j<arr2.length; j++){
                            if(arr1[i+j]!=arr2[j]){ // i=2
                                isPart = false;
                                break;
                            }else{
                                isPart = true;
                            }
                        }
                }
            }
        }
        if(isPart){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}