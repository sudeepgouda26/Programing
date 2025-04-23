public class frequency {
    public static void main(String[] args) {
        String str = "methodoverloadingu";
        int arr[] =new int[122];

        for(int i =0 ; i <str.length(); i ++){
            if(str.charAt(i) =='a' || str.charAt(i) =='e' || str.charAt(i) =='i'|| str.charAt(i) =='o'||str.charAt(i) =='u'){
                arr[str.charAt(i)]++;
            }
        }
        for(int i =0 ; i<arr.length; i++){
         if(arr[i]>0){
            System.out.println((char) i + "  " +arr[i]);
         }
        }
    }
  
}
