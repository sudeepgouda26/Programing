import java.util.Arrays;
public class AscSort {
        public static void main(String[] args) {
            int[] arr = {1,0,2,0,0,3,4};
        //   Arrays.sort(arr);
        //   for(int  i =0 ; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");

        //   }
        //   System.out.println('\n');
        //   for(int i = arr.length -1; i>=0; i--){
        //     System.out.print(arr[i] + " ");
        //   }

        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
 for(int i =0; i<arr.length; i++){
                System.out.print(arr[i]  + " ");
             }
             System.out.println('\n');

            for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr.length-1; j++){
                if(arr[j] ==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
             for(int i =0; i<arr.length; i++){
                System.out.print(arr[i]  + " ");
             }
        }
}
