public class P8 {
    public static void main(String[] args) {
        int row = 6;
        int column = 6;
        for(int i = 0; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int k = row; k >= i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = row; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int k = row; k >= i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
