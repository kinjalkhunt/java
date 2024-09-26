import java.util.*;
import java.util.function.Consumer;//this file has to be import compulsorily

/*public class lambda {
    //Use a lambda expression in the ArrayList's forEach() method to print every item in the list:
     public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();

        num.add(5);
        num.add(9);
        num.add(8);
        num.add(4);
        num.add(3);
        num.add(6);
        num.forEach((k)->{System.out.println(k);});

    }
    
}*/

/*public class lambda {
    //Use Java's Consumer interface to store a lambda expression in a variable:
     public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();

        num.add(5);
        num.add(9);
        num.add(8);
        num.add(4);
        num.add(3);
        num.add(6);
        Consumer<Integer> bb=(n)->{System.out.println(n);};
        num.forEach(bb);

    }
    
}*/

//Create a method which takes a lambda expression as ainterface StringFunction
 

interface StringFunction {

    String run(String str);
}

public class lambda{
    public static void main(String[] args) {
        
        StringFunction exclaim=(s)-> s+"!";
        StringFunction ask =(s)-> s+ "?";
        printFormatted("hello",exclaim);
        printFormatted("hello",ask);

    }
    public static void printFormatted(String str, StringFunction format){

        String result = format.run(str);
        System.out.println(result);
    }
}

