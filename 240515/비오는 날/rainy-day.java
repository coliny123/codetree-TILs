import java.util.*;
import java.time.*;

class Future{
    LocalDate time;
    String day;
    String weather;

    public Future(LocalDate time, String day, String weather){
        this.time = time;
        this.day = day;
        this.weather = weather;
    }

    public String toString() {
        return time + " " + day + " " + weather;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Future futures[] = new Future[n];

        for(int i=0; i<n; i++){
            LocalDate time = LocalDate.parse(sc.next());
            String day = sc.next();
            String weather = sc.next();
            futures[i] = new Future(time, day, weather);
        }

        Future rainyFuture[] = Arrays.stream(futures)
            .filter(f -> "Rain".equals(f.weather))
            .toArray(Future[]::new);

        Arrays.sort(rainyFuture, Comparator.comparing(future -> future.time));

        System.out.print(rainyFuture[0]);    
    }
}