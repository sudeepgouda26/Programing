public class ArraysOptimized {
 public static void reverse(int[] arr, int start, int end){
    while(start<end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
 }
   public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5 ,6,7};
    int k = 2 % arr.length; 
    int n = arr.length-1;
    reverse(arr,0,k-1);
    reverse(arr,k,n);
    reverse(arr,0,n);
    System.out.println(java.util.Arrays.toString(arr));
         
   } 
}
