package sample.test1;
import java.util.ArrayList;
import java.util.HashSet;

public class Shallow {
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args)
    {

		HashSet<ArrayList> set = new HashSet<>();
        HashSet<ArrayList> secondset = new HashSet<>();


        ArrayList<Integer> list1 = new ArrayList<>();


        ArrayList<Integer> list2 = new ArrayList<>();

        // Add elements using add method
        list1.add(1);
        list1.add(2);

        list2.add(3);
        list2.add(5);

        set.add(list1);
        set.add(list2);

       System.out.println(set);
      // System.out.println(set.size());
       secondset=(HashSet<ArrayList>) set.clone();
       System.out.println(secondset);
      // secondset.remove(list2);
      // secondset.clear();
       list1.remove(1);


       System.out.println(secondset);
       System.out.println(set);


       //secondset.clone();
      // set.remove(list2);


      //  System.out.println(secondset.size());
    }
}
