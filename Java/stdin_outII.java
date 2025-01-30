import java.util.Scanner;
public class stdin_outII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt(); // Read an integer input from the user
        double d = scan.nextDouble(); // Read a double input from the user
        scan.nextLine();  // reads the new line character
        String s = scan.nextLine(); // Read an integer input from the user

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}

    

