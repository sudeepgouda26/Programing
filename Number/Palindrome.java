class Palindrome{

    static boolean isPalindrome(String str){

        String res = "";
        for(int i = str.length()-1; i>=0; i--){
            res = res+str.charAt(i);
        }
        if(str.equalsIgnoreCase(res)){
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        String str  = "leveL";
      boolean x = isPalindrome(str);
      System.out.println(x);

    }
}