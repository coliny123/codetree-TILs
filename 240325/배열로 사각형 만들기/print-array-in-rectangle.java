public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = 5;
        int[][]arr2d = new int[n][n];


        for(int row=0; row<n; row++){
            arr2d[row][0] = 1;
        }
        for(int col=0; col<n; col++){
            arr2d[0][col] = 1;
        }

        for(int row=1; row<n; row++){
            for(int col=1; col<n; col++){
                arr2d[row][col] = arr2d[row-1][col] + arr2d[row][col-1];
            }
        }

        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                System.out.print(arr2d[row][col] + " ");
            }
            System.out.println();
        }
    }
}