
import java.util.*;
public class if_else {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        
        if (N%2!=0) {   //for N is odd:
            System.out.println("Weird");
        }else if ((N%2==0)&&(N >= 2 && N <= 5)) { //for N is even and in the range [2, 5] 
            System.out.println("Not Weird");
        }else if ((N%2==0)&&(N >= 6 && N <= 20)) { //for N is Even and in the range [6,20]
            System.out.println("Weird");    
        }else {
            System.out.println("Not Weird"); // when N is even and greater than 20
        }
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
    }
}


