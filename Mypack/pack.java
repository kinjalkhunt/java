//package/api....programme
package Mypack;

import java.util.Scanner;

public class pack {
    Scanner sc=new Scanner(System.in);
    int a,b;

    public void set()
    {
        System.out.println("this is my package...");
        System.out.println("enter the value of =>");
         a=sc.nextInt();
         b=sc.nextInt();
    }
    public void sum(){

        
        System.out.println("a+b=>"+(a+b));
    }
    public void mul(){

        System.out.println("a*b=>"+(a*b));
    }
    public void div(){
        System.out.println("a/b=>"+(a/b));

    }
    public void sub(){

        System.out.println("a-b=>"+(a-b));
    }
}
