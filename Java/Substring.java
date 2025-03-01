import java.util.*;
public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next(); 
        int start = in.nextInt(); //reading start index
        int end = in.nextInt(); //reading end index
        
        String result = S.substring(start,end); //extracting substring from start to end index
        System.out.println(result); 
        in.close();
    }
}


