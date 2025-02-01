import java.util.*;
public class End_Of_File {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print 
        output to STDOUT.*/
        Scanner n = new Scanner(System.in);
        int count=1; // initializing count from 1
        while(n.hasNext()){ // while there is a next line
            System.out.println(count++ + " "+ n.nextLine ()); // printing the line number and the line itself          
        }
        n.close();
    }
}

    

