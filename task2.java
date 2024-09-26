//given a sorted array of integer and target value return the index if target is found if not return the index where inserted in order
public class task2 {

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 7;
        int result = Insert(nums, target);// insert value and target index number
        System.out.println("Index: " + result);
    }

    public static int Insert(int[] num, int target) {
        int left = 0;
        int right = num.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (num[mid] == target) {
                return mid; // Target found
            } else if (num[mid] < target) {
                left = mid + 1; // Move to the right half
            } else {
                right = mid - 1; // Move to the left half
            }
        }

        // If target is not found, left variable will contain the index where it should
        // be inserted
        return left;
    }
}
