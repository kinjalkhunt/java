import java.util.Scanner;

public class subjectexception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the students of subject marks: ");
        int n = sc.nextInt();
        int total=0;
        double percentage;

        int[] a = new int[n];

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.print("Enter subject marks=> " + (i+1) + ": ");
            try {
                a[i] = sc.nextInt();
                if (a[i] < 0 || a[i] > 100) {
                    System.out.println("Marks should be between 0 and 100");
                }
                total=total+a[i];

                    
            }
                    catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid mark.");
                sc.nextDouble(); // Clear the input buffer
                i--; // Ask for input for the same student again
            }
        }

        // Output marks for each student
        System.out.println("\nStudent marks:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + ": " + a[i]);
        }
        
         percentage=total/n;
        System.out.println("sum=="+total);
        System.out.println("percentage=="+percentage);

        
    }
}