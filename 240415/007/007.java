import java.util.*;

class Spy {
    String secretCode;
    char meetingPoint;
    int time;

    public Spy(String secretCode, char meetingPoint, int time){
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();
        Spy s1 = new Spy(a, b, c);

        System.out.println("secret code : " + s1.secretCode);
        System.out.println("meeting point : " + s1.meetingPoint);
        System.out.println("time : " + s1.time);
    }
}