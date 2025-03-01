import java.util.*;
public class Strings_Introduction {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
         */
         Scanner D = new Scanner(System.in); //creating scanner object
         String A =D.next(); //reading input
         String B =D.next();
         int sum = A.length()+B.length();  //finding sum of lengths of A and B  
         System.out.println(sum);
         
         if (A.compareTo(B)>0) { //comparing A and B
            System.out.println("Yes");
         } else {
            System.out.println("No");
         }
         //capatalizing first letter of A and B
           String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
         System.out.println(capitalizedA+" "+ capitalizedB);
         
         
         D.close(); //closing scanner object to avoid memory leak
    }
}

    

