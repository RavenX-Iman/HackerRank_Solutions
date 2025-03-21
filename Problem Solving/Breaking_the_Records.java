import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
    int minRecord = scores.get(0);//1st game score as initial min
    int maxRecord = scores.get(0);//1st game score as initial max
        
        int minBreaks = 0; // Counter for min record breaks
        int maxBreaks = 0; // Counter for max record breaks

        for (int i = 1; i < scores.size(); i++) {
            int score = scores.get(i);//getting score of each game
            if (score > maxRecord) {
                maxRecord = score; // Update max
                maxBreaks++; // Increment max break count
            } else if (score < minRecord) {
                minRecord = score; // Update min
                minBreaks++; // Increment min break count
            }
        }

        return Arrays.asList(maxBreaks, minBreaks);//returning the list of max and min breaks
    }

}

public class Breaking_the_Records {  //Main class
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
