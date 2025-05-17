import java.util.*;
public class Union {
   


    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {3, 4, 5};

        Set<Integer> union = new HashSet<>(Arrays.asList(arr1));
        union.addAll(Arrays.asList(arr2));

        System.out.println(union); // [1, 2, 3, 4, 5]
    }
}


