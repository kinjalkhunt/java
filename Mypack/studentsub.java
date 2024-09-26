package Mypack;

import java.util.Scanner;
public class studentsub {
    
    Scanner sc=new Scanner(System.in);
    public int math,phy,eng;

    public void subject(){

    System.out.print("Enter marks in Maths, Physics and English: ");
    math=sc.nextInt();
    phy=sc.nextInt();
    eng=sc.nextInt();
    }
    
}
