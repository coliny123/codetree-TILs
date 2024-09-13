import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        TreeSet<Integer> set = new TreeSet<>();

        for(int i=1; i<=m; i++){
            set.add(i);
        }

        int ans=0;
        while(n-- > 0){
            int a = sc.nextInt();
            if(set.floor(a) != null){
                set.remove(set.floor(a));
                ans++;
            }else{
                break;
            }
        }

        System.out.println(ans);

        
    }
}