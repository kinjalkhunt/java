import java.util.*;
class paritycheck{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input the Hamming code
    System.out.print("Enter the 7th byte code=> ");
    String m = scanner.nextLine();

    // Perform parity check
    boolean isParityCheck = performParity(m);

    // Display the result
    if (isParityCheck) {
        System.out.println("Parity check passed. No error detected.");
    } else {
        System.out.println("Parity check failed. Error detected.");
    }

    scanner.close();
}

// Perform parity check
private static boolean performParity(String hammingCode) {
    int length = hammingCode.length();
    int errorPosition = 0;

    // Calculate parity bits
    for (int i = 0; i < length; i = (i << 1) + 1) {
        int parityBit = 0;
        for (int j = i; j < length; j += (i + 1) << 1) {
            for (int k = 0; k < i + 1 && j + k < length; k++) {
                parityBit ^= (hammingCode.charAt(j + k) - '0');
            }
        }
        if (parityBit != 0) {
            errorPosition += i + 1;
        }
    }

    if (errorPosition != 0) {
        System.out.println("Error at position: " + errorPosition);
        // Correct the error
        hammingCode = correctError(hammingCode, errorPosition);
        System.out.println("Corrected Hamming code: " + hammingCode);
        return false;
    }

    return true;
}

// Correct error in Hamming code
private static String correctError(String hammingCode, int errorPosition) {
    StringBuilder correctedCode = new StringBuilder(hammingCode);
    // Toggle the bit at the error position
    correctedCode.setCharAt(errorPosition - 1, (char) ('0' + ('1' - correctedCode.charAt(errorPosition - 1))));
    return correctedCode.toString();
}
}
