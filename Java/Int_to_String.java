public class Int_to_String {
    public static void main(String[] args) {
        // write your code here
        int n = 100; //initializing an integer n
        String s = Integer.toString(n); //converting integer n to string s

        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
           } else {
            System.out.println("Wrong answer.");
           }
    }
    
}




