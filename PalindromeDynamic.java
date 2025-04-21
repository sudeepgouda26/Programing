
import java.util.Scanner;
class PalindromeDynamic
{

	static String palindrome(String str){
		String result = "";
    for(int i =str.length()-1; i>=0; i--){
		result = result + str.charAt(i);

	}
	if(str.equalsIgnoreCase(result)){
      return ("palindrome");
	}else{
		return ("not a palindrome");
	}
	}
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String  \n:");
		String str = sc.nextLine();
		System.out.println(palindrome(str));
		
	}
}
y