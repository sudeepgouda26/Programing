import java.util.Arrays;

public class OneZero {

    static void sortArr(int[] arr){
        for(int i =0 ; i <arr.length-1; i ++){
            if(arr[i] >= arr[i+1]){
                int temp =arr[i];
                arr[i] =arr[i+1];
                arr[i+1] =temp;
            }
        }
    }
        public static void main(String[] args) {
        
    
    int[] arr = {1,0,2,0,0,0,3,0,4};

    sortArr(arr);
    // Arrays.sort(arr);

    for(int i =0 ; i <arr.length; i ++){
        System.out.print(arr[i] + " ");
    }
}
}
