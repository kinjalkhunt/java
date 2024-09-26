//
package Mypack;

import java.util.Scanner;

public class factorial {

    Scanner sc = new Scanner(System.in);
public void fact() {

        int fact = 1, n, i;
        System.out.println("enter number is=>");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial number is=>" + fact);

    }
public void fibb(){

    int n1=0, n2=1,n3,i,num;

    System.out.println("enter the number of elements=>");
    num=sc.nextInt();

    System.out.println("enter number=>"+n1);
    System.out.println("enter number=>"+n2);
    for(i=2; i<num;++i){

        n3=n1+n2;
        System.out.println(n3);
        n1=n2;
        n2=n3;
    }
    //System.out.println();
}    
 public int arm(){

    int n,r,sum=0,temp;

    System.out.println("enter the arm number=>");
    n=sc.nextInt();

    temp=n;
    while (n>0) {

        r=n%10;
        sum=sum+(r*r*r);
        n=n/10;
        
    }
    if(temp==sum){

        System.out.println("armstrong number");
    }
    else{
        System.out.println("not armstrong number");
    }
    //System.out.println(n);
    return 0;

}
public void neon(){

    int a,n,rev,sum=0;

            System.out.println("enter any neon number");
            n=sc.nextInt();

            a=n*n;

            while(a>0)
            {
                rev=a%10;
                sum=sum+rev;
                a=a/10;
            }
            if(n==sum)
            {
                System.out.println("is neon number=>"+n);
            }
            else
            {
                System.out.println("is not neon number=>"+n);
            }
        }  
public void perfact(){

    int i,n,r,sum=0;

    System.out.println("enter perfact number=>");
    n=sc.nextInt();

    for(i=1; i<n;i++){

        r=n%i;
        if(r==0){
            sum=sum+i;
        }
    }
     if(sum==n)
     {
        System.out.println("is perfact number");
     }
     else{
        System.out.println("is not prime number");
     }
}          
}


