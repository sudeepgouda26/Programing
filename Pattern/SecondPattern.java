public class SecondPattern {
    public static void main(String[] args) {
        for(int row =5;  row>=0; row--){
            System.out.println("");
            for(int col =0; col<=5; col++){
                if(row<=col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        }
    }
}
