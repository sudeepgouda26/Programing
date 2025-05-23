import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class  MergeTwoArray{
    public static void main(String[] args) {
        int arri[] = {1,1,3,4,5,2,6};
        int arrj[] = {1,2,3,4,5,6,7};
        Set<Integer> set = new HashSet<>();
       for(int i =0; i<arri.length; i++){
           set.add(arri[i]);
       }
       for(int i =0; i<arrj.length; i++){
           set.add(arrj[i]);
       }
       System.out.println(set);
       

    }
}