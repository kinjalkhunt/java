package Mypack;

import java.util.Scanner;

public class studentname{
     
    Scanner sc=new Scanner(System.in);
    public String name;
    public int roll;

   public void name(){

    //System.out.println("enter student information=>");
    //n=sc.nextInt();

    System.out.print("Enter Name: ");
    this.name=sc.nextLine();
   }
   public void roll(){
    
    System.out.print("Enter Roll Number: ");
    this.roll=sc.nextInt();
   
  }

}
