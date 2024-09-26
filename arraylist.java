import java.util.*;

//The ArrayList class has many useful methods. For example, to add elements to the ArrayList, use the add() method:


public class arraylist{

    public static void main(String[] args) {
        
        // ArrayList<String> a=new ArrayList<>();
        // a.add("hello");// is difine index a[0]
        // a.add("how");//a[1]
        // a.add("are");//a[2]
        // a.add("you");//a[3]
        // a.add("?");//a[4]
        //a.clear();//to clear all method and answer is null
        //a.remove(0);//to remove an element use the remove()
        //a.set(0,"moye moye");//to  modify an element use the set();
       // System.out.println(a);//print all add method 
        //System.out.println(a.size());//to find out how many element an arraylist have
        /*for(int i=0;i<a.size();i++){
           System.out.println(a.get(i));

        }*/

        //You can also loop through an ArrayList with the for-each loop:
         /*for(String i: a){

            System.out.println(i);
         }*/

         //Another useful class in the java.util package is the Collections class, which include the sort() 
         //method for sorting lists alphabetically or numerically:


        //  Collections.sort(a);
        //  for(String i:a){
        //     System.out.println(i);
        //  }

         ArrayList<Integer>bb=new ArrayList<Integer>();
         bb.add(33);
         bb.add(15);
         bb.add(23);
         bb.add(55);
         bb.add(11);
         bb.add(43);

         Collections.sort(bb, Collections.reverseOrder());
         for(int i:bb){
            System.out.println(i);
         }




    }


}
