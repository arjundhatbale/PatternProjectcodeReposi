public class P4 {
    public static void main(String[] args) {
        int row = 6;
        int column =6;
        for(int i =0; i <= row ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= row - 1 - i; k++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
