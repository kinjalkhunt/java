import java.util.*;

class tour{

    double mile,km;
    Scanner sc=new Scanner(System.in);
 
  public void aname(){

    //double mile,km;

    System.out.println("....WELCOME TO OUR TOUR AGENCY....");
    System.out.println();
    System.out.println("....VACATION TOUR AGENCY....");

    System.out.println();
    System.out.println("enter the miles=>");
    mile=sc.nextDouble();
  }  
  public A distance(A obj){
    //double km;
    A aa=new A();
    
     aa.mile = mile + obj.mile;

    return aa;

  }


}