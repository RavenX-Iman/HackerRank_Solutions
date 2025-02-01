import java.util.*;
public class Datatypes {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong(); // read the input as long
                System.out.println(x+" can be fitted in:"); 
                // Check for byte range
                if (x >= -128 && x <= 127){ // byte range is -128 to 127
                    System.out.println("* byte"); // print byte
                } 
                // Check for short range
                if (x >= -32768 && x <= 32767){ 
                     System.out.println("* short");
                }
                // Check for int range
                if (x >= -2147483648L && x <= 2147483647L){
                    System.out.println("* int");
                }          
                // Check for long range
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE){ //Long.MIN_VALUE and Long>MAX_VALUE are the min and max values of long
                     System.out.println("* long");
                }     
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
        sc.close();
    }
}

