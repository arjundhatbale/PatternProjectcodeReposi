public class P3 {
    public static void main(String[] args) {
        int row = 6;
        int column = 6;
        for(int i = 1; i <= row ; i ++){
            for(int j = column; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
