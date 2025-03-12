import java.io.*;
public class Staircase {
    //the function prints a staircase of size n
    //the staircase is right-aligned and composed of # symbols and spaces
    public static void stairs(int n) {
        // Write your code here
        for(int i=0;i<n;i++){ //loop through staircase rows n times

            for(int j=n-1;j>i;j--){ //loop through spaces
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){ //loop through # symbols
                System.out.print("#");
            }
            System.out.println();
        }
        }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        stairs(n); //calling the function without result class as it is a static method

        bufferedReader.close();
    }
}
