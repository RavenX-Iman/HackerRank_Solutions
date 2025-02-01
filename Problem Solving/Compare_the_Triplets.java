import java.util.*;
import java.util.stream.*;

public class Compare_the_Triplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) { 
        int aS = 0;
        int bS = 0;
        for (int i = 0; i <a.size(); i++) {
            //comparing elements of a and b at index i
            if (a.get(i) > b.get(i)) {  
                aS = aS + 1; 
            } else if (a.get(i) < b.get(i)) {
                bS = bS + 1;
            }
        }
        return Arrays.asList(aS, bS);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            a.add(scanner.nextInt());
        }

        for (int i = 0; i < 3; i++) {
            b.add(scanner.nextInt());
        }

        List<Integer> result = compareTriplets(a, b);

        System.out.println(result.stream().map(Object::toString).collect(Collectors.joining(" ")));

        scanner.close();
    }
}
