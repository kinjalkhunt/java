import java.util.*;

public class student2 {

    int eng, stat, acc, sci, guj, i, n;
    String name;
    int roll[] = new int[n];

    public void data()

    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter student info=>");
        n = sc.nextInt();

        for (i = 0; i <= n; i++) {

            System.out.print("enter name of student=>");
            name = sc.nextLine();

            System.out.println("roll[" + i + "]"+" ");
            roll[i] = sc.nextInt();

            System.out.print("Enter marks in subject=>: ");
            eng = sc.nextInt();
            stat = sc.nextInt();
            acc = sc.nextInt();

        }
    }

    public void info() {

        int total = eng + stat + acc;
        float perc = (float) total / 500 * 100;

        for (i = 0; i < n; i++) 
        {
            System.out.print("name is=>" + name);
            System.out.println("roll[i]" + roll[i]);

            System.out.println("Marks (sub): " + eng + "," + stat + "," + acc);
            System.out.println("Total: " + total + "\tPercentage: " + perc);
        }

    }

    public static void main(String[] args) {
        student2 s = new student2();
        s.data();
        s.info();

    }

}
