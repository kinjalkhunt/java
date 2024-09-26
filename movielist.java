import java.util.*;

public class movielist {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
          
        LinkedList<String> a=new LinkedList<>();

        System.out.println("....WELCOME TO MOVIETHEATER....");
        System.out.println();
        System.out.println("<<<<<< 1.RUNNING MOVIE NAME >>>>>>>");
        System.out.println("<<<<< 2.WEB SERIES >>>>>");
        System.out.println();
        System.out.println("**type a number to make a selection**");
        System.out.println();
        System.out.println("add your selection");
        int ch=sc.nextInt();


           switch (ch){

            case 1:
                LinkedList<String> m=new LinkedList<>();
                  System.out.println("....movie options....");
                  m.add("kgf");
                  m.add("salar");
                  m.add("enimal");
                  m.add("vivah");
                  System.out.println(m);
                  System.out.println();

                  System.out.println(":::what do you want:::");
                  System.out.println("1.add");
                  System.out.println("2.clear");
                  System.out.println("3.remove");
                  System.out.println("4.exit");
                  System.out.println(":::::please select one option::::::");
                  int c=sc.nextInt();

                  switch(c){

                    case 1:
                    System.out.println(":::::please select your option:::::");

                    System.out.println("1.last");
                    System.out.println("2.particular");
                    System.out.println("select one options");
                    int k=sc.nextInt();

                    switch(k){

                        case 1:

                        //System.out.println("add last");
                        System.out.println(m);
                        System.out.println("add last movie name you want");
                       // System.out.println("add=>");
                        String p=sc.nextLine();
                        //System.out.println();
                        m.add(p);

                        for(String last:m){

                        }
                        System.out.println(m);
                        break;

                        case 2:
                                //System.out.println("particular->");
                                System.out.println(m);
                                System.out.println("enter number u want to add movie");
                                int i=sc.nextInt();
                                System.out.println("add the movie name");
                                //int i2=sc.nextInt();
                                String ii=sc.nextLine();
                                //m.set(i, ii);

                                if (i>=0 && i<=m.size()){

                                    m.add(i,ii);
                                }
                                else{

                                    System.out.println(m.size());
                                }
                                for(String l:m){

                                }
                                System.out.println(m);
                            default:
                                break; 
                        } 
                        case 2:
            
                        System.out.println("remove at first");
                        System.out.print("  remove at particular");
                        System.out.println("select your opention");
                        int s=sc.nextInt();

                            switch (s) {
                            case 1:
                            System.out.println("remove at frist");
                            //System.out.println(m.removeFirst());
                            m.removeFirst();

                            for(String ss:m)
                            System.out.println(m); 
                            
                              break;

                              case 2:
                              //System.out.println("remove particular->");
                              System.out.println(m);
                              System.out.println("enter u want remove");
                              int v=sc.nextInt();

                              if( v>=0 && v<=m.size()){
                              m.remove(v);
                            }

                            for(String n:m){
                                System.out.println(m);
                            
                            
                              break;
                            }
                            default:
                            System.out.println("Invalid input");
                            break;
                        }
                        break;

                              case 3:
                                System.out.println("clear String");
                                System.out.println(m);
                                m.clear();
                                System.out.println(m);
                                break;
                            
                           case 4:
                              System.out.println(m); 
                              System.out.println("how many movie u want to add??");
                              int add=sc.nextInt();
                              for(int j=0;j<add;j++){

                                System.out.println("enter movie name"+(j+1)+"==");
                                String add1=sc.next(); 
                            m.add(add1);
                        System.out.println(m);                             }
                        }    
                        break;
                        default:
                        System.out.println("invalid input");
                         break;
                    }
                     
                   // break;
                
                    }
                } 
            
    


                  
                  

        


        
         
         


    
    
