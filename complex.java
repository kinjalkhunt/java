
//p-6..add two complex number
import java.util.*;


 class complex
{
    public static void main(String[] args)
  
    {
        Scanner aa = new Scanner(System.in);
        
        int r,i,p,k,j,sum=0;

        System.out.println("enter first real number=>");
        r=aa.nextInt();
        System.out.println("enter second imagin number=>");
        i=aa.nextInt();
        System.out.println("enter first real number=>");
        p=aa.nextInt();
        System.out.println("enter second imagin number=>");
        k=aa.nextInt();

        System.out.println("sum="+(r+i));
        System.out.println("sum="+(p+k));
        System.out.println("complex number is=>"+(r+p)+"j "+(i+k)+"j ");

    }
}
