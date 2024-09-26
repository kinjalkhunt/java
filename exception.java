import java.util.*;
/*public class exception {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        // System.out.println("print a+b=>");
        // int a=sc.nextInt();
        // int b=sc.nextInt();

        // System.out.println("sum is=>"+(a+b));


        try {//this is work for the same if/else.....
           System.out.println("a=>");
           int a=sc.nextInt();
           System.out.println("is true");
           } catch (Exception e) {
             System.out.println("in catch block");
            System.out.println(e);}
            {
            System.out.println("hello after try catch block");
          }
        }}*/

public class exception{

   public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);

        int a=5;
        int b=0;
        int result=a/b;

        try{

          System.out.println("is result shown by=>"+a/b);
        }
        catch (ArithmeticException e){

             System.out.println("division by Zero is not allowed");

        }
        System.out.println("is result is=>"+a/b);
   }
}        

    
    


