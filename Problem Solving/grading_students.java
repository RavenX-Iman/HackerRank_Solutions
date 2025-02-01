import java.util.ArrayList;
import java.util.List;

public class grading_students {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        ArrayList<Integer> result = new ArrayList<>(); //creating an arraylist to store the final grades
        for (int i = 0; i < grades.size(); i++) {  //iterating through the grades list
            int grade = grades.get(i); //getting the grade at index i
            if (grade >= 38) {         //checking if the grade is greater than or equal to 38
              int multiple = (int)(Math.ceil(grade/5.0)*5); //rounding the grade to the nearest multiple of 5
                if (multiple-grade< 3) {//checking if the difference b/w the rounded grade and the original grade is less than 3
                   result.add(multiple);//adding the rounded grade to the result list
                }else{
                    result.add(grade);//adding the original grade to the result list
                }
            }else{//if grade is less than 38
                result.add(grade);//adding the original grade to the result list
            }
        }
        return result; //returning the final grades list (result) after rounding
    }
// Main function to test the gradingStudents method
    public static void main(String[] args) {
        // Sample list of grades
        List<Integer> grades = List.of(73, 67, 38, 33);

        // Call the gradingStudents function and print the result
        List<Integer> finalGrades = gradingStudents(grades);
        
        // Print the final grades after rounding
        for (int grade : finalGrades) {
            System.out.println(grade);
        }
    }
}
