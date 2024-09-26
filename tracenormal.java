import java.util.*;

public class tracenormal
{
    static int max =50;

    static int Normal(int matrix[][], int N)
    {
        // Initializing sum
        int s = 0;
        for (int j = 0; j < N; j++)
        
            for (int k = 0; k < N; k++)
            
                s += matrix[j][k] * matrix[j][k];
                return (int)Math.sqrt(s);
            

    }
 
    // Finds trace of the given
    // matrix of size N x N
    static int Trace(int matrix[][], int N)
    {
        int s = 0;
        for (int j = 0; j < N; j++)
            s += matrix[j][j];
            return s;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

         int matrix[][]={{1,4,3},{4,7,6},{7,2,9}};
         
         System.out.println("normal matrix="+Normal(matrix,3));
         System.out.println("trace matrix="+Trace(matrix,3));
    }
 
}