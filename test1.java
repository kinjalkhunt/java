import java.util.*;
class test1 { 

    static Scanner sc=new Scanner(System.in);
  
    // print elements of array 
     static void print(int m[]) 
    { 
        
        for (int i = 1; i < m.length; i++) { 
            System.out.print(m[i]); 
        } 
        System.out.println(); 
    }
  
    // calculating value of redundant bits 
     static int[] calculation(int[]m, int r) 
    { 
        //String[] a;
        for (int i = 0; i < r; i++) { 
            
            int x = (int)Math.pow(2, i); 
            
            for (int j = 1; j < m.length; j++) { 
                if (((j >> i) & 1) == 1) { 
                   
                    if (x != j) 
                        m[x] = m[x] ^ m[j]; 
                } 
            } 
            System.out.println("r" + x + " = "
                               + m[x]); 
        } 
  
        return m; 
    } 
  //generatecode give us new encode 
    static int[] generateCode(String str, int M, int r) 
    { 
        int[] a = new int[r + M + 1]; 
        int j = 0; 
        for (int i = 1; i < a.length; i++) { 
            if ((Math.ceil(Math.log(i) / Math.log(2)) - 
                 Math.floor(Math.log(i) / Math.log(2))) == 0) { 
                a[i] = 0; 
            } 
            else { 
  
                // codeword[i] = dataword[j] 
                a[i] = (int)(str.charAt(j) - '0'); 
                j++; 
            } 
        } 
        return a; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
          
        // input message 
         System.out.println("enter 7 bit message=>");
         String str = sc.nextLine();//"0101"; 
         
         int M = str.length(); 
         
         //System.out.println("enter redudant=>");//if bydefault take r =1 
         int r = 0;//sc.nextInt(); 
  
        while (Math.pow(2, r) <(M + r + 1)) { 
            // r is number of redundant bits 
            r++; 
        } 
        int[] a = generateCode(str, M, r); 
  
        System.out.println("Generated parity check code "); 
        a= calculation(a, r); 
        print(a);
    }
}
