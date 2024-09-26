
import java.util.*;

public class hash {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> d = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the key size:");
        int kn = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < kn; i++) {
            ArrayList<String> v = new ArrayList<>();
            System.out.print("Enter the key:");
            String k = scanner.nextLine();
            System.out.print("Enter the value size:");
            int vn = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            for (int j = 0; j < vn; j++) {
                System.out.print("Enter value of " + k + ":");
                v.add(scanner.nextLine());
            }
            d.put(k, v);
        }
        System.out.println(d);

        Random random = new Random();
        for (String i : d.keySet()) {
            System.out.println("your key is " + i + " and name is-> " + d.get(i));
        }

        System.out.print("Enter your choice name:");//ahi values choise set karavvi
        String ch = scanner.nextLine();
        // for (String i : d.get(ch)) {
        //     int num = random.nextInt(900) + 100; // Random number between 100 and 999
        //     System.out.println(i + num + "@" + ch + ".com");
        // }
        // scanner.close();
    }
}