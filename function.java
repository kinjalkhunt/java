//without parameter & without return.... nothing return & noting taken
import java.util.*;

  class function 
{
    static void sum()
     {
        int a,b;

        Scanner sc=new Scanner(System.in);
         System.out.println("enter a and b=>");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("a+b="+(a+b));
      }
     public static void main(String[] args) 
     {
         sum();
     }
} 

//with parameter & without return...nothing return & taken something

 class function 
{
    static void sum(int a ,int b)
     {
         System.out.println("a+b="+(a+b));
   
      }
     public static void main(String[] args) 
     {
         Scanner sc=new Scanner(System.in);  
        int a,b;
        System.out.println("enter a value=>");
        a=sc.nextInt();
        b=sc.nextInt();
        sum(a,b);
   }
}
    
//without parameter & with return....return something & nothing taken


 class function 
{
     int sum()
     {
       // Scanner sc=new Scanner(System.in); 
         System.out.println("a value of a & b=");
         a=sc.nextInt();
         b=sc.nextint();
         return (a+b);
   
      }
     public static void main(String[] args) 
     {
         Scanner sc=new Scanner(System.in);  
        int c;
        System.out.print("a+b=");
        c=sum();
        
   }
}

//with parameter & with return....return something & taken something
  class function 
{
    static int sum(int a,int b)
     {
       // Scanner sc=new Scanner(System.in);
       int c;
       c=(a+b);
       return c; 
   
      }
     public static void main(String[] args) 
     {
        Scanner sc=new Scanner(System.in);  
        int a,b,c;
        System.out.print("a+b=");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sum(a+b);
        System.out.print(c);
        
   }
}
    





    


    





    

