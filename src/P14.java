public class P14 {
    public static void main(String[] args) {
        int row = 7;
        int count = 1;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
