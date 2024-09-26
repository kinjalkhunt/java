import java.util.*;
public class hashmap {//** One object is used as a key (index) to another object (value). 
    //It can store different types: String keys and Integer values, or the same type, like: String keys and String values:
    public static void main(String[] args) {
        
    
     HashMap<String, String> capital = new HashMap<String, String>();

     
     capital.put("England", "London");
     capital.put("Germany", "Berlin");
     capital.put("Norway", "Oslo");
     capital.put("USA", "Washington DC");
     capital.put("England","moye moye");
     capital.get("England"); 
    capital.remove("Germany");
    //capital.clear();*/
    System.out.println(capital);
    /*System.out.println(capital.size());

     for(String i:capital.keySet()){
       
              System.out.println(i);
     }*/
    
//      for(String i:capital.values()){
       
//         System.out.println(i);
// }

// for(String i:capital.keySet()){
       
//     System.out.println("key:"+i+" "+"values:"+" "+capital.get(i));
//    }

 /*  HashMap<String, Integer> people = new HashMap<String, Integer>();

   // Add keys and values (Name, Age)
   people.put("John", 32);
   people.put("Steve", 30);
   people.put("Angie", 33);

   for (String i : people.keySet()) {
     System.out.println("Name: " + i + " Age: " + people.get(i));


    }*/
}
}