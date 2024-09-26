//fact number use by recursion
import java.util.*;

public class recursion 
{
    public static int fact(int n)
      {
        if(n==1)
        {
        return 1;
        }
        else
        {
            return n*fact(n-1);
        }

      }
    public static void main(String[] args) 
    {
        System.out.println("k="+fact(5));
    }  
}
    

