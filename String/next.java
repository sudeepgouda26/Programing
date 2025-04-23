public class next {

    public static void main(String[] args) {
        String str =  "methods";
        String res ="";
        for(int i =0 ; i <str.length(); i++){
            char ch = (char)(str.charAt(i)+1);
            res +=ch;

        }
        System.out.print(res);
    }
    
}
