import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Locale;

public class Date_and_Time {
    // function to find the day of the week for a given date
        public static String findDay(int month, int day, int year) { 
        Calendar c = Calendar.getInstance(); // creating a new calender object
        //c.set(year, month - 1, day); sets the given date. (Note: Java's Calendar class treats months as zero-based e.g January is 0)
        c.set(year, month-1, day); // setting the date to calender object

        // Returning the day of the week in uppercase format:
        return c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase(); 
    }
      public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // Reading input values for month, day, and year
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        // Calling findDay function and storing the result
        String res = findDay(month, day, year);

        // Writing output to the file
        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close(); // Closing BufferedReader
        bufferedWriter.close(); // Closing BufferedWriter
      }
}
