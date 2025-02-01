import java.util.*;
public class Simple_Array_Sum {
    public static int simpleArraySum(List<Integer> ar) { //function to calculate the sum of elements in array
        int sum1 = 0; 
        for (int i = 0; i < ar.size(); i++) { 
            sum1 = sum1 + ar.get(i); // adding each element to sum
        }
        return sum1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arCount = scanner.nextInt();
        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < arCount; i++) {
            ar.add(scanner.nextInt());
        }

        int result = simpleArraySum(ar);

        System.out.println(result);

        scanner.close();
    }
}
