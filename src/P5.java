public class P5 {
    public static void main(String[] args) {
        int row = 6;
        int column= 5;
        for(int i = 0; i < row; i++){
            for(int j = 0 ; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < row-i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
