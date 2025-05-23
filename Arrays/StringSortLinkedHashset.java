import java.util.Set;
import java.util.LinkedHashSet;

public class StringSortLinkedHashset {
    public static void main(String[] args) {
        String str ="i m only my way to switzerland but Ihave lost my card ihave to get a duplicate";
        String[] str10  = str.split(" ");
        Set<String> set = new LinkedHashSet<>();
        for(int i =0; i<str10.length; i++){
            set.add(str10[i]);
        }
        System.out.println(set);
       }
}
