import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        LinkedList<Character> l = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();
        for(int i=0; i<str.length(); i++){
            l.add(str.charAt(i));
        }

        ListIterator<Character> it = l.listIterator(l.size());
        
        while(m-- > 0){
            char direction = sc.next().charAt(0);
            if(direction == 'L'){
                if(it.hasPrevious()){
                    it.previous();
                }
            }else if(direction == 'R'){
                if(it.hasNext()){
                    it.next();
                }
            }else if(direction == 'P'){
                char what = sc.next().charAt(0);
                it.add(what);
            }else if(direction == 'D'){
                if(it.hasNext()){
                    it.next();
                    it.remove();
                }
            }
        }
        it = l.listIterator();
        while(it.hasNext()) {               // 'd' 'b' 'c'
            System.out.print(it.next());    // 원소 값을 출력하며 한 칸 뒤로 이동합니다.
        } 
    }
}