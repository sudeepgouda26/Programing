public class NextChar {
    
public static void main(String[] args){
    String str ="hello";
    char[] ch = str.toCharArray();
     String res = "";
    for(int i =0 ; i<ch.length; i++){
        char el  = (char) (ch[i]+4);
        res = res + el;
    }
    System.out.print(res);
}

}
