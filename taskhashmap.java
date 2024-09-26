import java.util.*;
public class taskhashmap {

    public static void main(String[] args) {
        
          Scanner sc=new Scanner(System.in);

          System.out.println("how many keys you needed into hashmap=>");
          int nofkeys=sc.nextInt();

          sc.nextLine();//for the new line
          

          Map<String, ArrayList<String>> emailmap = new HashMap<>();
          
          for(int i=1; i<=nofkeys; i++){

            System.out.println("enter Key=>"+i+":->");
            String key=sc.nextLine();

            System.out.print("Enter the number of emails needed for key '" + key + "': ");
           int numberOfEmails = sc.nextInt();
            sc.nextLine(); // Consume the newline

            ArrayList<String> name= new ArrayList<>();

            for(int j=1; j<=numberOfEmails; j++){

                System.out.println("enter name==");
                String name1=sc.nextLine();
                name.add(name1);

            }
            emailmap.put(key,generateEmailAddresses(key,name));
        }

       for(Map.Entry<String,ArrayList<String>>entry:emailmap.entrySet())
       {
        System.out.println("key:->"+entry.getKey()+"Email:->"+entry.getValue());
       }
          
    }
private static ArrayList<String> generateEmailAddresses(String key, ArrayList<String> name) {

    Random random = new Random();

    ArrayList<String>emaillist=new ArrayList<>();

    for(String name1: name){

        int randomno=100+random.nextInt(999);
        String e=name1+randomno+"@"+key+".com";
        emaillist.add(e);


    }
    return emaillist;
}
}

        