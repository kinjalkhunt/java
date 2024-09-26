//•	Java Program to Reverse a String
import java.util.*;
public class reverseword {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String str;
        String rev="";
        char ch;

        System.out.println("original String=>");
        str=sc.nextLine();
       // System.out.println("java is best");

        for(int i=0; i<str.length();i++){

            ch=str.charAt(i);
            rev=ch+rev;
        }
        {
            System.out.println("reversed word=>"+" "+rev);
        }

    }
    
}
