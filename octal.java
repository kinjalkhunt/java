import java.util.*;

public class octal 
 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("octal num is=>");
        int oct=sc.nextInt();
    
        int rev=0;
        String ans=" ";

        while(oct>0)//octal to decimal convert
        {
            int r=oct%10;
                rev=rev*10+r;
                oct=oct/10;
        }

        while(rev>0)
             {
                int r=rev%10;
                if(r>=4)
                  {
                    r-=4;
                    ans+="e";
                  }
                 else
                  {
                    ans+="-";
                  } 
                if(r>=2)
                   {
                    r-=2;
                    ans+="w";
                   }
                 else
                   {
                    ans+="-";
                   } 
                if(r>=1)
                   {
                     
                     r-=1;
                     ans+="r";
                   }
                 else
                   {
                     ans="-";
                   } 
                }    
               System.out.println( rev=rev/10);
        }
}    