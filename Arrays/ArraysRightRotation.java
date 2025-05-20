public class ArraysRightRotation {
    public static void reverse(int[] arr , int start, int end){
        while(start<end){
            int temp = arr[start];
        arr[start] = arr[end];
    arr[end] = temp;
start++;
end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length-1;
        int  k = 2 % n;
 reverse(arr,0,n);
 reverse(arr,0,k-1);
 reverse(arr,k,n);
        System.out.println(java.util.Arrays.toString(arr));

    }
    
}
