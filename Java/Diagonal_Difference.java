import java.util.*;
public class Diagonal_Difference {
    // Function to calculate the absolute difference between the sums of the diagonals of a square matrix
    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size(); // Size of the square matrix
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        // Loop through the matrix to calculate diagonal sums
        for (int i = 0; i < n; i++) {
            primaryDiagonal += arr.get(i).get(i); // Left-to-right diagonal
            secondaryDiagonal += arr.get(i).get(n - i - 1); // Right-to-left diagonal
        }

        return Math.abs(primaryDiagonal - secondaryDiagonal); // Return absolute difference
    }

    // Main function to test diagonalDifference method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(scanner.nextInt());
            }
            arr.add(row);
        }
        scanner.close();
        System.out.println(diagonalDifference(arr));
    }
}
