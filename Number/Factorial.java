import java.util.Scanner;
class Factorial 
{
	static int factorial(int n){
		
		int mul =1;
		for(int i =n; i>1; i--){
			mul = mul*i;
		}
		return mul;

	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}
}
