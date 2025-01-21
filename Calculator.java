import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Taking the Number of subjects
        System.out.print("Enter the number of subjects: ");
        int numberOfSub = input.nextInt();

        int[] marks = new int[numberOfSub];
        int totalMarks = 0;

        for (int i = 0; i < numberOfSub; i++) {
            System.out.print("Enter marks of " + (i + 1) + " subject (out of 100): ");
            marks[i] = input.nextInt();

            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Appropriate marks. Please enter a the marks from 0 and 100:");
                marks[i] = input.nextInt();
            }

            totalMarks += marks[i];
        }

        // average percentage
        double avgPercent = (double) totalMarks / numberOfSub;

        //grade
        String grade;
        if (avgPercent >= 90) {
            grade = "First Division";
        } else if (avgPercent >= 80) {
            grade = "Second Division";
        } else if (avgPercent >= 70) {
            grade = "Third Division";
        } else if (avgPercent >= 60) {
            grade = "Forth Division";
        } else {
            grade = "Fifth Division";
        }

        // Result
        System.out.println("\n The Result Of The Student Is As Followed");
        System.out.println("Overall Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", avgPercent) + "%");
        System.out.println("Grade: " + grade);

        input.close();
    }
}
