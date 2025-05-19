import java.util.Arrays;

public class RotationArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int k =3;
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
