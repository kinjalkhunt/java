//binary to octol conversion

import java.util.*;

public class conbi 
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter value of binary no=>");
        int b=sc.nextInt();

        int oct=0,dec=0,r,base=1,deci=0,c=0;
        char hexa[],size=100;
        while(b>0)//binary to decimal or...first find a bin to dec and second dec to oct and get bin to octal
        {
                 r=b%10;
                 dec+=r*base;
                 b=b/10;
                 base=base*2;
             
        }
        base=1;
       System.out.println("deci number=>"+dec);
        while(dec>0)//decimal to octal
        { 
                r=dec%8;
                
                oct+=r*base;
                dec=dec/8;
                base=base*10;
        }
        System.out.println("oct number is=>"+oct);
        System.out.println("enter octal number=>");
        int n=sc.nextInt(); 
         while(oct>0)//octal to decimal
        {         
                n=oct%10;
                deci += n*Math.pow(8,c);
                oct=oct/10;
                c++;
                //base=base*8;
        }
        System.out.println("decimal number is=>"+deci);
        
        System.out.println("enter hexa decimal number=>");
        char k=sc.next
             while(hexa>0)
        { 
                r=dec%16;
                if(hexa>'0' && hexa<'9')
                {

                }
                
                oct+=r*base;
                dec=dec/8;
                base=base*10;
        }
        System.out.println("oct number is=>"+oct);

    
        }
    
    }   

