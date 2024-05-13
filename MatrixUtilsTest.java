package src;

/**
 * MatrixUtilsTest class is responsible for testing the MatrixUtils class.
 */
public class MatrixUtilsTest {

    /**
     * Main method for testing the MatrixUtils class.
     *
     * @param args the command line arguments (unused)
     */
    public static void main(String[] args) {
        // Test case 1
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int result1 = MatrixUtils.findMostRepeatedNumber(matrix1);
        System.out.println("Most repeated number in matrix1: " + result1);

        // Test case 2
        int[][] matrix2 = {
                {1, 2, 2},
                {2, 3, 4},
                {5, 2, 6}
        };
        int result2 = MatrixUtils.findMostRepeatedNumber(matrix2);
        System.out.println("Most repeated number in matrix2: " + result2);
    }
}
