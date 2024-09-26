
import java.util.*;
import java.util.stream.IntStream;


public class string 
{
    public static void main(String[] args) 

    {
        Scanner sc=new Scanner(System.in);
            //string declaration
           /*  String fname;
             String lname;
             String name;
             
             //name=sc.nextLine();//if take only next(); it takes only one word for example "kinjal khunt"output is only "kinjal"
                // System.out.println("your name is=>"+name);
            System.out.print(" fname =>");
             fname=sc.nextLine();
             System.out.print(" ");
             System.out.print("lname =>");
             lname=sc.nextLine();
             name=fname + " " +lname;
             
             //concate
             System.out.println(name+""+"concate");
             
             //lowercase()
            System.out.println(name.toLowerCase()+" ==>"+"lower");//use to change lowercase

            //uppercase()
             System.out.println(name.toUpperCase()+" ==>"+"upper");//use to change uppercase
             
             //indexof()
             System.out.println(name.indexOf("khunt", 0)+""+"find index no.");//gave us to this words index number
             
             //length()
             System.out.println(name.length()+" "+"legnth find");//use length find(.length)
                
             //trim()
             String c="kinjal khunt";
             System.out.println(c.trim()+" "+"trim");//trim function is not count a space            
             
             //contains()
             String d="KIRTAN KHUNT";
             System.out.println(c.contains("KIRTAN")+" "+"contains");//is gave us result true or false          
             
             //isEmpty()
             String e=" ";
             System.out.println(e.isEmpty()+" "+"empty");//isEmpty function is count space and gave us answer in output true or false..          
            
            //isBlank()
             System.out.println(e.isBlank()+" "+"blank");//isblank function is not count space and gave us result is true or false
             
             //charAt()
             System.out.println(name.charAt(4)+" "+"chareAt");//indexof is put given index numbers charactor
             
             //equals()
             System.out.println(d.equals(c)+" "+"equals");//this function gave us output true or false
             
             //replace()
             System.out.println(d.replace('R','e')+" "+"replace");*///tjis function is gave us output is charactor replace  
             
              //compareto()                             
             String p="apple";
             String k="APPLE";
             System.out.println(p.compareTo(k)+" "+"compareto");
             
             //comparetoignorcase()
             System.out.println(p.compareToIgnoreCase(k)+" "+"comparetoignorcase");//Compares two strings lexicographically, ignoring case differences	rerurn type...int                        
             
             //equalsignorecase
             String f="hello";
             String g="Hello";         
           System.out.println(f.equalsIgnoreCase(g)+" "+"equalsignorecase");//this method are ignor to capital and small diffrences and answer return is true or false           
           
           //lastindex()
           String str="hello hy how r u?";
           System.out.println(str.lastIndexOf("u"));//is gave us find out last index number
          
           //chars()
           IntStream b=f.chars();//this method gave us return aascii value...
           b.forEach(System.out::print);
        
           //split()....this method split the sentence of word..
           String[] aa=str.split("h");
           for(String l:aa)
           System.out.println(l);

           //join()...this method is join the word
           String a1=String.join(" < ","four", "five", "six", "sevan");
           System.out.println(a1);
           
            //endsWith()...give result true or false
            String b1="welcome to java";
            System.out.println(b1.endsWith("java"));
        
            //startsWith()
            String c1="welcome home keep smile";
            System.out.println(c1.startsWith("welcome"));

            //getbytes()
            String a2="hello i am kinjal";
            byte[]c2=a2.getBytes();
            for (int i = 0; i < c2.length; i++) 
            System.out.print(c2[i]);

            //substring is find us word is which index number;
            String sente="i love my family";
            String name=sente.substring(8,sente.length());
            System.out.println(name+" "+"substring");

            //hashcode()Two objects with the same value have the same hashcodes or different values usually have different hashcodes.
            String k1="100";
            String k2="101";
            System.out.println(k1.hashCode()+"=>"+"hashcode of k1");
            System.out.println(k2.hashCode()+"=>"+"hashcode of k2");

            //codepointAt()..finding codepoint value for character at index...
            String n="hello books";
            System.out.println(n.codePointAt(1));

            //codepointbefore()The index start is "0" and we passed is "1" but the method here is codePointBefore which finds the before character from the specified index which is "h" and its Unicode code point value-101.
            System.out.println(n.codePointBefore(1));

            //codepointcount()finding  no of codepoint values between specified indexes
            System.out.println(n.codePointCount(1, 4));

            //offsetbycodepoints()In this example, offsetByCodePoints returns an index from specified index:1  by offset_value:5 i.e., 1+5=6.
            System.out.println(n.offsetByCodePoints(1, 5));

            //contantequals()invoking contentEquals method for String one and two
            StringBuffer sb = new StringBuffer("hey how r u?");
            String o="hey how r u?";
            String t="hey how u?";

            System.out.println(o.contentEquals(sb));
            System.out.println(t.contentEquals(sb));

            //getchars()
            /*srhStartIndex : Index of the first character in the string to copy. 
            srhEndIndex : Index after the last character in the string to copy.
            destArray : Destination array where chars will get copied.
            destStartIndex : Index in the array starting from where the chars
            will be pushed into the array.
            Return: It does not return any value.*/
            //describeconstable()
            String o3="html is hyper text language";
            System.out.println(o3.describeConstable());
            
            //getchars()
            char []dest =new char[30];
            o3.getChars(14, 20,dest, 0);
            System.out.println(dest);
           
            //copyvalueof()
            char a[] = {'a','b','c'};
            String z =String.copyValueOf(a);
            System.out.println(z);
            
            // valueof()
            int w = 10;
            String x=String.valueOf(w);
            System.out.println(x);

            //replace
            String y = "   Java Moye Moye    ";
            System.err.println(y.replace("Moye", "hello"));
            // Strip()
            System.out.println(y.strip());
            
          StringBuilder sw=new StringBuilder("kk");
            System.out.println(sw.toString());
           // System.out.println(sw);


                /*String aname="kirtan";
                String bname="khunt";

                //1 s1>s2: +ve value;
                //2 s1==s2; 0;
                //3 s1<s2: -ve value;

                // in this string value is high of any alphabet word for example
                   // hello or wello....so wello is grater than hello 

                if (aname.compareTo(bname)==0)
                {
                    System.out.println("Strings are equal");
                }
                else{
                    System.out.println("is not equal");
                }*/
                

    }
    
}
