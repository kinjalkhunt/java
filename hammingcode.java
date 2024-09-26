import java.util.*;
public class hammingcode {

    //private static int i;

    // Function to calculate the Hamming code for 4 bits of data
    public static String calculateHammingCode(String m) {
        // Calculate the number of redundant bits required (r)(2^r >= m+r+1)
        int r = 1;
        while (Math.pow(2, r) < m.length() + r + 1) {
            r++;
        }

        // Create an array to store the bits of the Hamming code
        char[] hammingCode = new char[m.length() + r];
        
        // Initialize the Hamming code with '?' (placeholder) at redundant bit positions
        for (int i = 0, j = 0; i < hammingCode.length; i++) {
            if (i == (int) Math.pow(2, j) - 1) {
                hammingCode[i] = '?';
                j++;
            } else {
                hammingCode[i] = m.charAt(i - j);
            }
            System.out.println(hammingCode[i]);//print elements of array
                    
        }

        // Fill in the values of the redundant bits and sum of bits
        for (int i = 0; i < r; i++) {
            int position = (int) Math.pow(2, i) - 1;
            int count = 0;
            for (int j = position; j < hammingCode.length; j += (position + 1) * 2) {
                for (int k = j; k < j + position + 1 && k < hammingCode.length; k++) {
                    if (hammingCode[k] == '1') {
                        count++;
                    }
                }
            }
            hammingCode[position] = (count % 2 == 0) ? '0' : '1';
        
        
        }
        return new String(hammingCode);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for 4 bits of data
        System.out.print("Enter 4 bits of data: ");
        String data = scanner.next();

        // Check if the input length is 4
        if (data.length() != 4) {
            System.out.println("Please enter exactly 4 bits of data.");
        } else {
            // Calculate and display the Hamming code
            String hammingCode = calculateHammingCode(data);
            System.out.println("Hamming code: " + hammingCode);
        }

        scanner.close();
    }
}
    
