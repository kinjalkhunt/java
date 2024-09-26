
// given to sorted arrays return the midiun of two sorted arrays programe in java.
import java.util.*;

public class task3 {
    public double midium(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        if (n % 2 == 0) {
            return (findem(nums1, nums2, 0, 0, n / 2) + findem(nums1, nums2, 0, 0, n / 2 + 1)) / 2.0;
        } else {
            return findem(nums1, nums2, 0, 0, n / 2 + 1);
        }
    }

    private int findem(int[] nums1, int[] nums2, int start1, int start2, int k) {
        if (start1 >= nums1.length) {
            return nums2[start2 + k - 1];
        }
        if (start2 >= nums2.length) {
            return nums1[start1 + k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }

        int mid1 = start1 + k / 2 - 1 < nums1.length ? nums1[start1 + k / 2 - 1] : Integer.MAX_VALUE;
        int mid2 = start2 + k / 2 - 1 < nums2.length ? nums2[start2 + k / 2 - 1] : Integer.MAX_VALUE;

        if (mid1 < mid2) {
            return findem(nums1, nums2, start1 + k / 2, start2, k - k / 2);
        } else {
            return findem(nums1, nums2, start1, start2 + k / 2, k - k / 2);
        }
    }

    public static void main(String[] args) {
        task3 solution = new task3();
        int[] nums1 = { 1, 3, 4, 6 };
        int[] nums2 = { 3, 4 };
        System.out.println("Mediun of two sorted arrays: " + solution.midium(nums1, nums2)); // Output: 2.0
    }
}