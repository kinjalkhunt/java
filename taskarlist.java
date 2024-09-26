   import java.util.*;

 class taskarlist {
     // Method 1
     // To create and return 2D ArrayList
     static List create2DArrayList()
    {
 
         // Creating a 2D ArrayList of Integer type
         ArrayList<ArrayList<Integer> > x = new ArrayList<ArrayList<Integer> >();
 
         // One space allocated for R0
         x.add(new ArrayList<Integer>());
 
         // Adding 3 to R0 created above x(R0, C0)
         x.get(0).add(0, 3);
          // Creating R1 and adding values
         // Note: Another way for adding values in 2D
         // collections
         x.add(new ArrayList<Integer>(Arrays.asList(3, 4, 6)));
 
         // Adding 366 to x(R1, C0)
         x.get(1).add(0, 366);
 
        // Adding 576 to x(R1, C4)
         x.get(1).add(4, 576);
 
         // Now, adding values to R2
         x.add(2, new ArrayList<>(Arrays.asList(3, 84)));
 
         // Adding values to R3
         x.add(new ArrayList<Integer>(
             Arrays.asList(83, 6684, 776)));
 
         // Adding values to R4
          x.add(new ArrayList<>(Arrays.asList(8)));
          // Appending values to R4
         x.get(4).addAll(Arrays.asList(9, 10, 11));
          // Appending values to R1, but start appending from
         // C3
         x.get(1).addAll(3, Arrays.asList(22, 1000));
 
         // This method will return 2D array
         return x;
     }
 
 
     // Method 2
    // Main driver method
     public static void main(String args[])
   {
         // Display message prior for better readability
         System.out.println("2D ArrayList :");
 
         // Printing 2D ArrayList by calling Method 1
         System.out.println(create2DArrayList());
   }}

// /*public class taskarlist {
//     public static void main(String[] args) {
//         // Creating a nested ArrayList
//         ArrayList<ArrayList<Integer>> nestedList = new ArrayList<>();

//         // Creating inner ArrayLists and adding them to the outer ArrayList
//         ArrayList<Integer> innerList1 = new ArrayList<>();
//         innerList1.add(1);
//         innerList1.add(2);
//         innerList1.add(3);
//         nestedList.add(innerList1);

//         ArrayList<Integer> innerList2 = new ArrayList<>();
//         innerList2.add(4);
//         innerList2.add(5);
//         nestedList.add(innerList2);

//         // Accessing elements from the nested ArrayList
//         System.out.println("Elements of nestedList:");
//         for (ArrayList<Integer> innerList : nestedList) {
//             System.out.print("Inner List: ");
//             for (Integer element : innerList) {
//                 System.out.print(element + " ");
//             }
//             System.out.println();
//         }

//         // Modifying elements of the nested ArrayList
//         nestedList.get(0).set(1, 10);
//         nestedList.get(1).add(6);

//         // Printing modified nested ArrayList
//         System.out.println("\nModified elements of nestedList:");
//         for (ArrayList<Integer> innerList : nestedList) {
//             System.out.print("Inner List: ");
//             for (Integer element : innerList) {
//                 System.out.print(element + " ");
//             }
//             System.out.println();
//         }
//     }
// }*/


/*public class taskarlist {
	public static void main(String[] args) {
		ArrayList< ArrayList<Character> > dice = new ArrayList< ArrayList<Character> >();
		for(int i = 0; i<2; i++){
		   ArrayList<Character> die = new ArrayList<Character>();
		   for (int j = 0; j < 6; j++){
		       die.add((char)(Math.random()*17 + 65));
		   }
		   dice.add(die);
		 }
 
 
		for(int i = 0; i < dice.size(); i++){
			System.out.print("Dice " + i + ": ");
			for(int j = 0; j < dice.get(i).size(); j++){
				System.out.print(dice.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}*/
