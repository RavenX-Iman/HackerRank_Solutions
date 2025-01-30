import java.util.Scanner; // Importing Scanner for input handling
public class Time_Conversion {
// Class containing the timeConversion function

    public static String timeConversion(String s) {
        String s1; // Temporary variable to store the updated hour

        // Handle the midnight case (12:00:00AM -> 00:00:00)
        if (s.substring(0, 2).equals("12") && s.contains("AM")) {
            s1 = "00"; // Replace hour with "00" for midnight
            s = s1 + s.substring(2, s.length()); // Append minutes and seconds
        } 
        // Handle PM cases (e.g., 01:00:00PM -> 13:00:00)
        else if (s.contains("PM")) {
            int hour = Integer.parseInt(s.substring(0, 2)); // Extract hour as integer
            if (hour != 12) { // If hour is not already 12 PM
                hour += 12; // Add 12 to convert to 24-hour format
            }
            s1 = Integer.toString(hour); // Convert updated hour back to string
            s = s1 + s.substring(2, s.length()); // Append minutes and seconds
        }

        // Remove the AM/PM suffix and return the result
        return s.substring(0, s.length() - 2);
    }


// Main class where the program starts execution

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    System.out.println(timeConversion(s));
    scanner.close();
    }
}

