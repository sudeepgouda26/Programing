import java.util.TreeSet;

public class Sets {
   public static void main(String[] args) {
    int arr[] ={9,1,1,3,3,38,7,6,6,5,3,5,2};
    TreeSet<Integer> set = new TreeSet<>();
    for(int i =0; i<arr.length; i++){
        set.add(arr[i]);
    }
    System.out.println(set);
   } 
 
}
