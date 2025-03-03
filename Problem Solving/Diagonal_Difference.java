import java.io.*;
import java.util.*;
class Result {
    /* The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.*/

     //arraylist is a part of collection framework in java
     //list is an interface in java
    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
      int n = arr.size(); // Size of the square matrix
        int primaryDiagonal = 0; //sum of primary diagnol
        int secondaryDiagonal = 0; //sum of secondary diagnol
        
        //loop through the matrix to get sum of primary & secondary diagnol
        for (int i = 0; i < n; i++) {
            primaryDiagonal += arr.get(i).get(i); // Left-to-right diagonal 
            secondaryDiagonal += arr.get(i).get(n - i - 1); // Right-to-left diagonal
        }
        //math.abs() method returns absolute value of the argument
        return Math.abs(primaryDiagonal - secondaryDiagonal);//return the absolute difference

    }

}

public class Diagonal_Difference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
