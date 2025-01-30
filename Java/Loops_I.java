import java.io.*; 
public class Loops_I {
    public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); 
    
    int N = Integer.parseInt(bufferedReader.readLine().trim()); 

        // Looping from 1 to 10 to print the multiplication table
        for(int i = 1; i <= 10; i++) { 
             // Displaying multiplication in a formatted way
            System.out.println(N + " x " + i + " = " + (i * N));
        }

        bufferedReader.close(); 
    }
}
