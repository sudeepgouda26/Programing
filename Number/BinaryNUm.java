public class BinaryNUm {
    public static void main(String[] args) {
        int n =8;
        String res = "";
        while(n>0){
            int rem = n%2;
             res = rem + res;
             n/=2;
        }
        System.out.println(res);
    }
}
