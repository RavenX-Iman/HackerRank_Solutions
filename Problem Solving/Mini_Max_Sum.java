import java.io.*;
import java.util.*;

public class Mini_Max_Sum {
    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void miniMaxSum(List<Integer> arr) {
        long totalSum = 0;
        int minElement = arr.get(0); //initializing minelement to first(0) element of array
        int maxElement = arr.get(0);

        // Use a simple for loop to calculate totalSum, minElement, and maxElement
        for (int i = 0; i < arr.size(); i++) { //loop through the sze of array
            int current = arr.get(i); //get the element at index i
            totalSum += current; // Add current element to totalSum

            // Update minElement if the current element is smaller
            if (current < minElement) {
                minElement = current;
            }

            // Update maxElement if the current element is larger
            if (current > maxElement) {
                maxElement = current;
            }
        }

        // Calculate the minimum and maximum sums
        long minSum = totalSum - maxElement; // Exclude the largest element
        long maxSum = totalSum - minElement; // Exclude the smallest element

        // Print the results
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        miniMaxSum(arr); // Call method without "Result." since it's now in the same class

        bufferedReader.close();
    }
}


