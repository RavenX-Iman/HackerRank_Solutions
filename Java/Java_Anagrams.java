import java.util.*;

public class Java_Anagrams  {
    
    public static boolean isanagram(String a,String b){
        //to avoid case sensitivity
        a= a.toLowerCase();
        b= b.toLowerCase();
        
        //comparing length of strings
        if(a.length()!= b.length()){
        return false;
        }
        
        //converting stringd each alphabet to a char to sort
        char[] a1= a.toCharArray();
        char[] b1= b.toCharArray();
        
        //sorting same chars in each array
        Arrays.sort(a1);
        Arrays.sort(b1);
        
        //checks if both arrays have equal and same chars(sort)
        return Arrays.equals(a1, b1);
                    
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    String a;
    String b;
    
    Scanner sc= new Scanner(System.in);
    a= sc.next();
    b=sc.next();
    
    if (isanagram(a, b)){
        System.out.println("Anagrams");
    }else{
        System.out.println("Not Anagrams");
    }
    
    }
    
    
}
