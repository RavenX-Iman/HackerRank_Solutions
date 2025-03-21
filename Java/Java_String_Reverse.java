import java.util.*;

public class Java_String_Reverse { //Main class

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in); //to get user input
        String A=sc.next();//to read the string from user
        /* Enter your code here. Print output to STDOUT. */

        // Reverse the string
        String reversed = new StringBuilder(A).reverse().toString();
//1. new StringBuilder(A)
//StringBuilder is a mutable (changeable) sequence of characters.
//When you create a StringBuilder object with A, it initializes a new StringBuilder containing the characters of A.
//2. .reverse()
//The .reverse() method reverses the characters inside the StringBuilder.
//3.toString()
//Since StringBuilder is not a String, we need to convert it back to a String.
//.toString() does that conversion.

        //StringBuilder sb = new StringBuilder("hello");
        //sb.reverse(); // Now sb contains "olleh"

        // Check if the original string is equal to the reversed string
        if (A.equals(reversed)) { //equals() method compares the original string with the reversed string , returns true if equal else false
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}

