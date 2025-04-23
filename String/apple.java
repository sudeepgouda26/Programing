public class apple {
    public static void main(String[] args) {
        String str = "apple";
        char[] ch =  str.toCharArray();
        int j = ch.length-1;
        int i =0;
        while(i<=j){

            char temp = (char)(ch[i]+1);
              ch[i] = (char)(ch[j]+1);
              ch[j] = temp;
              i++;
              j--;


        }
        String res ="";

        for(int k =0; k< ch.length; k++){
        res+=ch[k];
        }
        System.out.println(res);
    }
}
