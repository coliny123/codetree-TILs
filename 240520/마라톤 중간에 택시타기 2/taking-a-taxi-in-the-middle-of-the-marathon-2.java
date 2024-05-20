import java.util.*;

class Pair{
    int x, y;

    public Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair checkPoints[] = new Pair[n];

        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            checkPoints[i] = new Pair(x, y);
        }

        int answer[] = new int[n-1];
        int idx=1;
        for(int j=0; j<n-1; j++){
            int texiMeter = 0;
            for(int i=1; i<n-1; i++){
                if(i==idx){
                    texiMeter += Math.abs(checkPoints[i-1].x - checkPoints[i+1].x) + Math.abs(checkPoints[i-1].y - checkPoints[i+1].y);
                }else if(i==idx-1){
                    texiMeter += Math.abs(checkPoints[i-1].x - checkPoints[i].x) + Math.abs(checkPoints[i-1].y - checkPoints[i].y);
                }
                else{
                    texiMeter += Math.abs(checkPoints[i].x - checkPoints[i+1].x) + Math.abs(checkPoints[i].y - checkPoints[i+1].y);
                }
            }
            idx++;
            answer[j] = texiMeter;
        }

        Arrays.sort(answer);

        System.out.println(answer[0]);


        
    }
}