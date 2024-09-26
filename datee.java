import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//this is not include in package so add this (localdate) class 
/*public class datee {//Display current date

    public static void main(String[] args) {
        
        LocalDate pp=LocalDate.now();
        System.out.println(pp);
    }

    
}*/

/*public class datee {//Display current time

    public static void main(String[] args) {
        
        LocalTime pp=LocalTime.now();
        System.out.println(pp);
    }

    
}*/
/*public class datee {//Display current date & time  and...formatter

    public static void main(String[] args) {
        
        LocalDateTime pp=LocalDateTime.now();
        System.out.println("today current time and date=>"+ pp);
       
        //DateTimeFormatter k=DateTimeFormatter.ofPattern("dd-MM-yyyy  == HH:mm:ss");
        //DateTimeFormatter k=DateTimeFormatter.ofPattern("dd/MM/yyyy  == HH:mm:ss");
        //DateTimeFormatter k=DateTimeFormatter.ofPattern("yyyy-MM-dd == HH:mm:ss");
        DateTimeFormatter k=DateTimeFormatter.ofPattern("E,== MM dd yyyy == HH:mm:ss");

        String fdate=pp.format(k);   
        System.out.println("After formatting:->"+ fdate); 
    }

    
}*/


// Java program to demonstrate constuctors of Date 

/*public class datee 
{ 
	public static void main(String[] args) 
	{ 
		LocalDate date=LocalDate.now();
        LocalDate yesterday=date.minusDays(1);
        LocalDate tomorrow=date.plusDays(1);

        System.out.println("today date==>"+date);
        System.out.println("yesterday date==>"+yesterday);
        System.out.println("tomorrow date==>"+tomorrow);
	} 
}*/

/*import java.time.LocalDate;//Program to demonstrate isLeapYear() method of LocalDate Class.

public class datee{

    public static void main(String[] args) {
        
        LocalDate date=LocalDate.of(2017,1,13);
        System.out.println(date.isLeapYear());
        LocalDate date1=LocalDate.of(2016,9,23);
        System.out.println(date1.isLeapYear());
    }
}*/

public class datee {//Program to demonstrate atTime() method of LocalDate class.

  
    public static void main(String[] args) {  
      LocalDate date = LocalDate.of(2016, 1, 30);  
      LocalDateTime datetime = date.atTime(1,50,9);      
      System.out.println(datetime);   
    }  
  }  
  







