package src;

/**
 * ArraysNew class is the main class responsible for executing tasks related to matrices.
 * It contains the main method to test the functionality of MatrixUtils class.
 */
public class ArraysNew {

    /**
     * Main method to test the MatrixUtils class.
     *
     * @param args the command line arguments (unused)
     */
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Find the most repeated number in the matrix
        int mostRepeatedNumber = MatrixUtils.findMostRepeatedNumber(matrix);
        System.out.println("Most repeated number in the matrix: " + mostRepeatedNumber);
    }
}
