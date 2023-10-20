public class p12 {
    public static void main(String[] args) {
        int row = 10;
        for(int i = 1; i <= row; i++){
            for(int j = row; j >i; j--){
                System.out.print("+");
            }
            System.out.print("*");
            for(int k= 1; k < 2 *( i -1); k++){
                System.out.print("&");
            }
            if(i == 1){
                System.out.println("");
            }else{
                System.out.println("*");
            }
        }
        for(int i = row-1; i >= 1; i--){
            for(int j= row; j > i; j--){
                System.out.print("^");
            }
            System.out.print("*");
            for(int k=1; k <(2*( i -1)); k++){
                System.out.print("@");
            }
            if(i == 1){
                System.out.println("");
            }else{
                System.out.println("*");
            }
        }
    }
}
