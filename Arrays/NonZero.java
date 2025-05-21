import java.util.Arrays;

public class NonZero {
    public static void main(String[] args) {
        int arr[] = {1,2,1,0,3,0,2,0,4,0,5};
        int n = arr.length -1;
        int j = -1;
        for(int  i= 0; i<=n; i++){
            if(arr[i]==0)
            {
                  j=i;
                  break;
                
                }
        }
        if(j==-1){
            System.out.println("No zero found");
        }else{
            for(int i=j+1;i<=n; i++){
                if(arr[i]!=0){
                    int temp = arr[j];
                    arr[j] =arr[i];
                    arr[i] =temp;
                    j++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
      
    }
}
