import java.io.*;
import java.util.*;

public class Birthday_Cake_Candles {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */
    public static int birthdayCakeCandles(List<Integer> candles) {
        int count = 0;
        int max = candles.get(0);//initialize max height of candle to 1st element of array
        
        // Find the maximum height of the candles
        for (int i = 1; i < candles.size(); i++) {
            if (candles.get(i) > max) { //get() method is used to get the element of a specific index
                max = candles.get(i); //update max height if the current element is greater
            }
        }
        
        // Count how many candles have the maximum height
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) == max) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] candlesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> candles = new ArrayList<>();

        for (int i = 0; i < candlesCount; i++) {
            int candlesItem = Integer.parseInt(candlesTemp[i]);
            candles.add(candlesItem);
        }

        int result = birthdayCakeCandles(candles); // Call method directly

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
