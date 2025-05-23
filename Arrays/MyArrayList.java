import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);

        list.add(3);
        list.add(2);    
        list.add(4);
      for(int i =0; i<list.size(); i++){
        for(int j =0; j<list.size()-1; j++){
            if(list.get(j) >list.get(j+1)){
                int temp = list.get(j);
                list.set(j,list.get(j+1));
                list.set(j+1,temp);
            }
        }
      }
        
System.out.println(list);
    }
}
