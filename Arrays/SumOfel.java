public class SumOfel {
    public static void main(String[] args) {
        int sum = 0;
       int[] arr = {9,7,6,5,8,3,4,2,1};

       for(int i =0; i <arr.length; i++){
           if(arr[i] %2 ==0){
               sum = sum +arr[i];
           }
       }
       System.out.println(sum);
   }
}
