import java.util.*;
class Loops_II{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();//number of queries/ test cases
        for(int i=0;i<t;i++){//for each query / test case

            int a = in.nextInt();  // a: The starting value of the series.
            int b = in.nextInt(); //b: The multiplier.
            int n = in.nextInt(); //n: The number of terms to generate.

            int sum = a; //sum is initialized to a
            
            for (int j = 0; j < n; j++) { // for each term in series
                 // sum = sum + b*2^j
                sum += b * (1 << j); // 1 << j is a bitwise left shift, equivalent to 2^j
                //So, b * (1 << j) is equivalent to b * 2^j.
                System.out.print(sum + " "); 
            }
            System.out.println();  
        }
        in.close();
        }
}
