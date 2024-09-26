//boundry element of matrix

import java.util.*;
public class boundryarray {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

           int mat[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
            
           System.out.println("Input Matrix=>");
           
           for(int i=0; i< mat.length;i++)
           {
              for(int j=0; j< mat[i].length;j++)
                 {
                    System.out.print(mat[i][j]);
                 }
                 System.out.println();
           }

           System.out.println("result matrix is=>");

           for(int i=0; i<mat.length;i++)
           {
            for(int j=0; j< mat[i].length; j++)
               {
                if (i == 0 || j == 0 || i == mat.length - 1 
                || j == mat[i].length - 1) { 
                System.out.print(mat[i][j]); 
               }
               else{
                System.out.print(" ");
               }
           }
           System.out.println();
    }
    
}
}