import java.util.Scanner;
public class UptoSingleDigit {
    static int sumOfNumber(int n){
        int sum =0;
        while (n>0) {
            int rem = n%10;
            sum = sum +rem;
            n/=10;
        }
        
        return sum;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int  n = sc.nextInt();

      while(n>9){
        n = sumOfNumber(n);
      }
      System.out.println(n);
    }
}
