//task
import java.util.*;
public class samelist {

    public static void main(String[] args) {
        
        ArrayList<String> b=new ArrayList<>();

        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();


         b.add("Weetech@gmail.com");
         b.add("weetech@yahoo.com");
         b.add("weetech@outlook.com");
         b.add("weetech@gmail.com");

         int mid=b.size()/3;        
         ArrayList<Integer> firstHalf = new ArrayList<>(b.subList(0, mid));
         ArrayList<Integer> secondHalf = new ArrayList<>(b.subList(mid, b.size()));
         
         // Sort both halves
         Collections.sort(firstHalf);
         Collections.sort(secondHalf);        
         
         System.out.println("First Half Sorted: " + firstHalf);
         System.out.println("Second Half Sorted: " + secondHalf);

        //System.out.println(b);
    }
}
    
