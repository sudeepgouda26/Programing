public class RangePrime {
    public static void main(String[] args) {
        int  n =100;
        for(int i = 2; i<100; i++){
            int el = i;
            boolean flag = true;
          for(int  j=2; j<el; j++){
            if (el%j ==0) {
                flag = false;
                break;
            }
          }
          if (flag) {
            System.out.println(el);
            
          }
        }
    }
}
