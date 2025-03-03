import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
     //The function accepts INTEGER_ARRAY arr as parameter.

    public static void plusMinus(List<Integer> arr) {
    // Write your code here

    int p=0; //positive
    int ne=0;//negative
    int z=0;//zero

    //loop through array to get count of positive, negative & zero elements
    for(int i=0;i<arr.size();i++){
     if(arr.get(i)>0){ //get() method is used to get the element of a specific index
        p= p+1; //increment positive count
     }
     if(arr.get(i)<0){
        ne= ne+1;
     }if(arr.get(i)==0){
        z= z+1;
     }   
    }
    //calculating the fraction of positive negative & zero elements
    float positive=(float)p/arr.size(); //typecasting to float
    float negative=(float)ne/arr.size(); //arr.size() returns the size of arraylist
    float zero=(float)z/arr.size();
    System.out.printf("%.6f%n", positive); //%.6f is used to print the float value upto 6 decimal places
    System.out.printf("%.6f%n", negative);
    System.out.printf("%.6f%n", zero);
    }

}

public class Plus_Minus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
