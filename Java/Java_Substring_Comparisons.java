public class Java_Substring_Comparisons {

    public static String getSmallestAndLargest(String s, int k) {
        // Initialize with the first 'k' length substring (from index 0 to k-1)
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Loop through all possible substrings of length 'k'
        // Start from index 1 and go up to (length - k) to extract all k-length substrings
        for (int i = 1; i <= s.length() - k; i++) {
            // Extract substring of length 'k' starting from index 'i' to 'i + k - 1'
            String sub = s.substring(i, i + k);

            // Compare and update smallest substring
            // compareTo() method compares two strings lexicographically (dictionary order)
            if (sub.compareTo(smallest) < 0) { // If sub is smaller than smallest
                smallest = sub; // Update smallest
            }

            // Compare and update largest substring
            if (sub.compareTo(largest) > 0) { // If sub is greater than largest
                largest = sub; // Update largest
            }
        }

        // Return the smallest and largest substrings separated by a newline
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        // Example test case
        String s = "welcometojava"; // Input string
        int k = 3; // Length of substrings to compare

        // Call method and print the result
        System.out.println(getSmallestAndLargest(s, k));
    }
}
