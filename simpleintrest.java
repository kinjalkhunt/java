//a programme find by simple intrest
import java.util.*;

public class simpleintrest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in percentage): ");
        double rateOfInterest = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double timePeriod = scanner.nextDouble();

        
        scanner.close();

        
        double simpleInterest = (principal * rateOfInterest * timePeriod) / 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
}
    

