import java.util.*;

public class replacech {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the first String==> ");        
        String str=sc.nextLine();
        System.out.println("enter the new word u want to ad==>");
        String k=sc.nextLine();

        String[] str1=str.split(" ");

        StringBuilder p= new StringBuilder();

        System.out.println("input=="+str);
        System.out.println("output=="+k);

        for(int i=0; i<str1.length;i++)
        {
            String a=str1[i].substring(1)+str1[i].charAt(0);
            System.out.print(a+k+"");
       }

    }

    
}
