public class covert {
    public static void main(String[] args) {
        String str  = "ovERloaDiNG";

        char[] ch = str.toCharArray();
   
        for(int i =0; i<ch.length; i++){
            int  a=ch[i];
            if(a >=65 && a < 97){
              ch[i]=(char)(ch[i] +32); 
            }else if(a > 97){
                ch[i]=(char)(ch[i] -32); 
            

            }
        }
        System.out.println(ch);
        }
}
