import java.util.Scanner;

public class student {
  public static void main(String args[])
      {
          String name[]={"kinjal","jalpa","dharti","shweta"};
        
          int roll[]={1,2,3,4};
          int math, phy, eng,i,n;
           
          Scanner SC=new Scanner(System.in);

            System.out.println("enter student information=>");
            n=SC.nextInt();
          
            for(i=0; i<n; i++)
            {
           
               // System.out.println("Enter Name: ");
               // name[i]=SC.nextLine();
                System.out.println("Enter Roll Number: ");
                roll[i]=SC.nextInt();
                System.out.print("Enter marks in Maths, Physics and English: ");
                math=SC.nextInt();
                phy=SC.nextInt();
                eng=SC.nextInt();
            
                int total=math+eng+phy;
                float perc=(float)total/300*100;
           
                System.out.println("name is:" + name[i] +"\troll no is: "+roll[i]);
                System.out.println("Marks (Maths, Physics, English): " +math+","+phy+","+eng);
                System.out.println("Total: "+total +"\tPercentage: "+perc);
            
      }
    }
      }