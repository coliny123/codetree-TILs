import java.util.*;

class Charicter{
    String id;
    String level;

    public Charicter(String id, String level){
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        String level = sc.next();
        Charicter charicter1 = new Charicter("codetree", "10");
        Charicter charicter2 = new Charicter(id, level);

        System.out.println("user " + charicter1.id + " lv " + charicter1.level);
        System.out.println("user " + charicter2.id + " lv " + charicter2.level);

    }
}