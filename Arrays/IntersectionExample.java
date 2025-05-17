import java.util.*;

public class IntersectionExample {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {2, 3, 4};

        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));

        set1.retainAll(set2);  // Intersection
        System.out.println(set1); // [2, 3]
    }
}
