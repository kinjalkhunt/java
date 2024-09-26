import java.util.*;


 class function1 
{
    static void sum() //without returnt type without parameter
    {

        int a, b;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter sum of a and b=>");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("a+b=" + (a + b));

    }
    static void mul(int c,int d)//without return type with parameter
    {
        System.out.println("multiply is="+(c*d));
    }

    static int div()//without parameter & with return
     {
            Scanner sc =new Scanner(System.in);
            int g,h,c;
            g=sc.nextInt();
            h=sc.nextInt();
            c=g/h;
            return c;
     }

    static int sub(int p, int k)//with parameter & with return
     {
        int l;
        l=(p-k);
        return l;
     }

public static void main(String[] args) 
     {
        Scanner sc=new Scanner(System.in);

         sum();//without return & without parameter
         
         System.out.println("enter a value by multi is=>");//without return type with parameter
    
         int e,f;
         e=sc.nextInt();
         f=sc.nextInt();
         mul(e,f);

         //without parameter & with return
         System.out.println("enter value divided by=>");
        int ans  = div();
        System.out.println("div::=>" + ans);

        int p,k,l;//with parameter and with return
        System.out.println("enter value substitute by=>");
        p=sc.nextInt();
        k=sc.nextInt();
        l = sub(p,k);
        System.out.println("Sub::=>" + l);
     }
}
