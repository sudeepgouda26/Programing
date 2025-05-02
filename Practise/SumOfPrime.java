public class SumOfPrime {
    public static void main(String[] args) {
        int first =20;
        int last = 50;
        int sum =0;
        for(int i =first+1; i<last; i++){
            int el = i;

            boolean flag =true;
            for(int j =2 ; j<el; j++){
                if(el%j ==0){
                flag = false;
                break;

                }

            }
            if(flag){
                sum+=el;
                System.out.print( " " + el);
            }
        }
        System.out.println("\n"+sum);
    }
    
}
