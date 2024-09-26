import java.util.*;

public class ispalindrome 
{
        // private static int i;

        public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            
            
            System.out.print("enter string value==->");
            String rev = "";
            String str=sc.nextLine();
            
            char ch;
           
           // int n=str.length();

            System.out.println("orignal string==>"+str);
            
            for (int i=0; i< str.length(); i++)
              {
                  ch=str.charAt(i);
                  rev=ch+rev; 
            }
            System.out.println("reverse String== "+rev);

             if(str.equals(rev)) 
             {
              System.out.println("is palindrom");
             }
             else
            
             { 
              System.out.println("is not palindrom");
             }

        }
    }         
    



