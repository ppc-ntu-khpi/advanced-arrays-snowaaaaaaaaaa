package src;

import java.util.Arrays;

/**
 * MatrixUtils class contains methods for solving tasks related to matrices.
 * This class provides a method to find the number that repeats the most in a matrix.
 */
public class MatrixUtils {

    /**
     * Finds the number that repeats the most in the matrix.
     *
     * @param matrix the matrix to search
     * @return the number that repeats the most
     */
    public static int findMostRepeatedNumber(int[][] matrix) {
        // Flatten the matrix into a single array
        int[] flattenedMatrix = Arrays.stream(matrix)
                                      .flatMapToInt(Arrays::stream)
                                      .toArray();

        // Sort the flattened matrix
        Arrays.sort(flattenedMatrix);

        int maxCount = 0;
        int mostRepeatedNumber = flattenedMatrix[0];
        int currentNumber = flattenedMatrix[0];
        int currentCount = 1;

        // Iterate through the sorted array to find the most repeated number
        for (int i = 1; i < flattenedMatrix.length; i++) {
            if (flattenedMatrix[i] == currentNumber) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mostRepeatedNumber = currentNumber;
                }
                currentNumber = flattenedMatrix[i];
                currentCount = 1;
            }
        }

        // Check if the last number is the most repeated
        if (currentCount > maxCount) {
            mostRepeatedNumber = currentNumber;
        }

        return mostRepeatedNumber;
    }
}
