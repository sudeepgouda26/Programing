import java.util.Scanner;
public class NumPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy =n;
        int rev = 0;
        while (n>0) {
            int rem = n%10;
            rev = rev*10 +rem;

            n/=10;
            
        }

        if(copy == rev){
            System.out.println("palindome");

        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
