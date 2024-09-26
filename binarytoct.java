//binary to decimal to octol to hexa conversion in added use by header file 

import java.util.*;

public class binarytoct 
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter any number=>");
        String binary=sc.next();

        int decimal=Integer.parseInt(binary,2);

        System.out.println("decimal no="+decimal);
        String octol=Integer.toOctalString(decimal);
        System.out.println("octol number=>"+octol);
        String hexa=Integer.toHexString(decimal);
        System.out.println("hexa number=>"+hexa);
    }    
}
