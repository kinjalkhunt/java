
//given an unsorted integer array return the positive integer there is not present in the array
import java.util.*;

class task1 {
    public static int smallestnum(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        // Add all positive integers from the array to the set
        for (int num : arr) {
            if (num > 0) {
                set.add(num);
            }
        }

        // Find the smallest positive integer that is missing from the set
        int smallest = 1;
        while (set.contains(smallest)) {
            smallest++;
        }

        return smallest;
    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        int[] arr = { -2, -5, 3, 6 };
        System.out.println("small" + " " + smallestnum(arr));
    }
}

// int n, i;
// System.out.println("enter value of n=>");
// n = sc.nextInt();

// int a[] = new int[n];

// for (i = 0; i < n; i++) {
// System.out.println("a[" + i + "]:");
// a[i] = sc.nextInt();
// }
// }
