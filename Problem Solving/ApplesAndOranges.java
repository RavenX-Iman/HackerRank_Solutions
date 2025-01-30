import java.util.ArrayList;
import java.util.List;

public class ApplesAndOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
 // Lists to store final positions of apples and oranges
        ArrayList<Integer> m = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();
        
        // Calculate final positions of apples and add them to 'm'
        for (int i = 0; i < apples.size(); i++) {
            int apple = apples.get(i);
            apple = a + apple;
            m.add(apple);
        }
        
        // Calculate final positions of oranges and add them to 'n'
        for (int i = 0; i < oranges.size(); i++) {
            int orange = oranges.get(i);
            orange = b + orange;
            n.add(orange);
        }
        
        // Count apples within the region [s, t]
        int mcount = 0;
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i) >= s && m.get(i) <= t) {
                mcount++;
            }
        }
        
        // Count oranges within the region [s, t]
        int ncount = 0;
        for (int i = 0; i < n.size(); i++) {
            if (n.get(i) >= s && n.get(i) <= t) {
                ncount++;
            }
        }
        
        // Output the results
        System.out.println(mcount);
        System.out.println(ncount);

}
public static void main(String[] args) {
    // Example input
    int s = 7; // Starting of the region
    int t = 11; // Ending of the region
    int a = 5;  // Position of the apple tree
    int b = 15; // Position of the orange tree

    List<Integer> apples = List.of(-2, 2, 1); // Distances apples fall
    List<Integer> oranges = List.of(5, -6);   // Distances oranges fall

    // Call the function
    countApplesAndOranges(s, t, a, b, apples, oranges);
}
}
