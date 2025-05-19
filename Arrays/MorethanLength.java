import java.util.Arrays;

public class MorethanLength {
      public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int k =8 % arr.length;
        for(int i =0; i<arr.length; i++){
                if (i < k) {
                    System.out.println(arr[arr.length + i -k]);
                    
                }else{
                    System.out.println(arr[i -k]);
                }
            }
                System.out.println(Arrays.toString(arr));
            }
}
