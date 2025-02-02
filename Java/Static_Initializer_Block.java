import java.util.*;
public class Static_Initializer_Block {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in); //scanner object to read input from user
        int B=sc.nextInt(); //reading the breadth
        int H=sc.nextInt(); //reading the height
        int area = B*H;  //calculating area using formula a = b*h
        if(B<=0 || H<=0){ //checking if breadth or height is less than or equal to 0
            System.out.println( "java.lang.Exception: Breadth and height must be positive"); //exception message
        }else{
            System.out.println(area); //printing the area
        }
        sc.close();
    }
}

