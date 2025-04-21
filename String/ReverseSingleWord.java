class   ReverseSingleWord{

    static void reverseWord(String str){

        String[] words = str.split(" ");

        for(int i =0; i<words.length; i++){
            String result ="";
            for(int j =words[i].length()-1; j>=0; j--){
                result= result + words[i].charAt(j);
            }
            System.out.print(result+ " ");
        }
       

    }
    public static void main(String[] args){
        String str = "how are you";
        reverseWord(str);

    }
}