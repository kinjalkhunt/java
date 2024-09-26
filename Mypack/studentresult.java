package Mypack;

import java.util.Scanner;
import Mypack.studentsub;
import Mypack.studentname;

public class studentresult {

    Scanner sc=new Scanner(System.in);

 public void result(){   

    studentname k=new studentname();

    k.name();
    k.roll();
     
    studentsub p=new studentsub();
    p.subject();
    int total=p.math+p.eng+p.phy;
    float perc=(float)total/3;

  
     
    System.out.println("Roll Number:" + k.roll +"\tName: "+k.name);
    System.out.println("Marks (Maths, Physics, English): " +p.math+","+p.phy+","+p.eng);
    System.out.println("Total: "+total +"\tPercentage: "+perc);
 }
      
    
}
