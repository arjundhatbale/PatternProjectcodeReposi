import java.lang.Thread;
public class P7 {
    public static void main(String[] args) {
       int row = 6;
       int column = 6;
       try{

       for(int i = 1; i <= row; i++){
           for(int j = i; j < row ; j++){
               Thread.sleep(200);
               System.out.print("@");
           }
           for(int k = 1; k <= i; k++){
               System.out.print("*");
           }
           System.out.println();
        }
        for(int i = row; i >= 1; i--){

            for(int j= i; j <= row; j++){
                Thread.sleep(300);
                System.out.print("@");
            }
            for(int k = 1; k <i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
       }catch(Exception e){
           System.out.println(e);
       }
    }
}
