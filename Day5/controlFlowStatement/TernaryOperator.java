package controlFlowStatement;

public class TernaryOperator{

    public static void main(String[] args) {
        
        /*Syntax 
            (condition) ? True expression1 : False expression2;
        */
        int age = 18;
        // Check if adult using a ternary operator
        String message = (age >= 18) ? "You are an adult." : "You are not an adult.";
        System.out.println(message);

        // Find the larger number using a ternary operator
        int num1 = 10;
        int num2 = 20;
        int largerNumber = (num1 > num2) ? num1 : num2;
        System.out.println("The larger number is: " + largerNumber);

        // Nested ternary operator for complex logic
        double grade = 85.5;
        String letterGrade = (grade >= 90) ? "A" : ((grade >= 80) ? "B" : ((grade >= 70) ? "C" : "D"));
        System.out.println("Your letter grade is: " + letterGrade);

        // double grade1 = 85.5;
        // String gradeLetter = "";

        // if(grade1 > 60){
        //     gradeLetter = "D";
        // }
        // if(grade1 <= 80){
        //     gradeLetter = "B";
        // }
        // else{
        //     gradeLetter = "A";
        // }

        // System.out.println(gradeLetter);



    }
}
