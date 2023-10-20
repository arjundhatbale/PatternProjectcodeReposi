public class P2 {
    public static void main(String[] args) {
        System.out.println("name is arjun ");

        int row  = 6;
        int count = 1;
        for(int i = 1; i <= row ; i++){
            for(int j= (row - 1); j >= i; j-- ){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int l = (row - 1); l >= 1; l--){
            for(int j= (row - 1); j >= l; j-- ){
                System.out.print(" ");
            }
            for(int k = 1; k <= l; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
