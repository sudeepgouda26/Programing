import java.util.Arrays;

public class ArraysRotateBrute {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // Number of positions to rotate
        for(int i =0; i <k  ; i++){
            int temp = arr[0];
            for(int j =1; j<arr.length;j++){
               arr[j-1] = arr[j];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
