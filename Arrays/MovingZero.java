public class MovingZero {
    public static void main(String[] args) {
        int arr[] = {1,0,3,2,4,0,5,0,6,0};
        int n = arr.length;
        int j =-1;
        for(int i =0; i<n; i++){
            if(arr[i] == 0){
                j =i;
                break;
            }
            if(j ==-1){
                System.out.println("No zero found");
            }
            
        }
        for(int i =j+1; i<n ; i++){
            if(arr[i] !=0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i]=temp;
                j++;
            }
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}
