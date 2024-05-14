import java.util.*;

class Pair{
    char name;
    int score;

    public Pair(char name, int score){
        this.name = name;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Pair arr[] = new Pair[5];
        for(int i=0; i<5; i++){
            char name = sc.next().charAt(0);
            int score = sc.nextInt();
            arr[i] = new Pair(name, score);
        }

        Pair minPair = arr[0];
        for(int i=1; i<5; i++){
            if(arr[i].score < minPair.score){
                minPair = arr[i];
            }
        }

        System.out.println(minPair.name + " " + minPair.score);
    }
}