public class P9 {
    public static void main(String[] args) {
        int row = 10;
        int column = 6;

        for(int i = 0; i <= row; i++){
            for(int j = 0; j <= row / 2; j++ ){
                if((i == 0) || (j == 0) || (i == row/2) ||(j == row/2)){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
