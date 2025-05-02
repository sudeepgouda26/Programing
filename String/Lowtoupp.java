public class Lowtoupp {
    public static void main(String[] args) {
        String str = "meTHodOVRloadINg";

        char[] arr = str.toCharArray();
        for(int i =0; i<arr.length;i++){
            int ch =arr[i];
            if(ch>=(int)('A') && ch<=(int)('Z') ){
                arr[i] =(char)(ch+32);
            }else if(ch>=(int)('a') && ch<=(int)('z')){
                arr[i] =(char)(ch-32);
            }
        }
        System.out.println(arr);
    }
}

