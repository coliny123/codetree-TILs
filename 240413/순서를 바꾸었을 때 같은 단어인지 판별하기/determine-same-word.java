import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char arr1[] = new char[str1.length()]; 
        char arr2[] = new char[str2.length()];

        arr1 = str1.toCharArray(); 
        arr2 = str2.toCharArray();

        Arrays.sort(arr1); 
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}