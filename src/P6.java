public class P6 {
    public static void main(String[] args) {
        int row = 6;
        int column = 6;
        for(int i = 0; i < row ; i++){
            for(int j= 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int l = (row - 1); l >= 0; l--){
            for(int m = l ; m > 0; m--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
