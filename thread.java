/*import java.util.*;

//Multithreading is the ability of a program or an operating system to enable more 
//than one user at a time without requiring multiple copies of the program running 
//on the computer .

class chattingwithgf extends Thread{
    
    public void run(){

         for(int i=1; i<=100; i++){

            System.out.println("chatting with gf=>"+i);
         }chattingwithgf gf=new chattingwithgf();
        // makingmeggi mg=new makingmeggi();
    }

}
class makingmeggi extends Thread{

    public void run(){

        for (int i=1; i<=100; i++)

    System.out.println("making meggi=>"+i);


    }
}
public class thread {

    public static void main(String[] args) {
        
        chattingwithgf gf=new chattingwithgf();
        makingmeggi mg=new makingmeggi();

        gf.start();
        mg.start();
    }


    
}*/

/*import java.util.*;
class chattingwithgf implements Runnable{//define a thread.....impliment and runnable
    
    public void run(){

         for(int i=1; i<=100; i++){

            System.out.println("chatting with gf=>"+i);
         }
    }

}
class makingmeggi implements Runnable{

    public void run(){

        for (int i=1; i<=100; i++)

    System.out.println("making pasta=>"+i);


    }
}
public class thread {

    public static void main(String[] args) {

        chattingwithgf gf=new chattingwithgf();
        makingmeggi mg=new makingmeggi();

        Thread t1=new Thread(gf);
        Thread t2=new Thread(mg);
        
        t1.start();
        t2.start();
        // gf.start();
        // mg.start();
    }
}*/
/*import java.util.*;//concurrency thread 
public class thread extends Thread {
    public static int amount = 1;
  
    public static void main(String[] args) {
      thread t1= new thread();
      t1.start();
      System.out.println(amount);
      amount++;
      System.out.println(amount);
    }
  
    public void run() {

        for(int i=1; i<100; i++){
           System.out.println(amount);
            amount++;
    }
  }}*/
 /*import java.util.*;//is alive thread
  public class thread extends Thread {
    public static int amount = 0;
  
    public static void main(String[] args) {
       thread t1 = new thread();
      t1.start();
      // Wait for the thread to finish
      while(t1.isAlive()) {
        System.out.println("Waiting...");
      }
      // Update amount and print its value
      System.out.println("Main: " + amount);
      amount++;
      System.out.println("Main: " + amount);

    }
    public void run() {

       for(int i=0; i<=10; i++) 
       {
        System.out.println(amount);
        amount++;
       }
      
    }
  }*/
  /*import java.util.*;
  class table{//synchronized method

    synchronized void printtable(int n){
       
        for(int i=1; i<=10; i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }

    }
  }
  class print extends Thread{

    table t;
    print(table t){

        this.t=t;
    }
    public void run(){

        t.printtable(10);
    }
  }
  class print1 extends Thread{

    table t1;
    print1(table t1){

        this.t1=t1;
    }
    public void run(){

        t1.printtable(100);
    }
  }
  public class thread{
    public static void main(String[] args) {
        
        table p=new table();//only one object
        print p1=new print(p);
        print1 p2=new print1(p);

        p1.start();
        p2.start();

    }
  }*/

  import java.util.*;
  class table{//annynomouse method

    synchronized void printtable(int n){
       
        for(int i=1; i<=10; i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }

    }
  }
  public class thread{
    public static void main(String[] args) {
        
        final table tt = new table();//only one object  
  
Thread t1=new Thread(){  
public void run(){  
tt.printtable(5);  
}  
};  
Thread t2=new Thread(){  
public void run(){  
tt.printtable(100);  
}  
};
t1.start();
t2.start();
}}
  





