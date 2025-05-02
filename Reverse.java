class Reverse{
    public static void main(String[] args) {
        String str = "hello";
        char[] ch = str.toCharArray();
        int j = ch.length-1;
        for(int i =0; i < j/2; i++){
            char temp =  ch[i];
            ch[i] =ch[j-i];
            ch[j-i] =temp;
        }
        System.out.println(ch);
    }
}