// Program to Calculate Student Grades based on marks in 5 subjects.

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter marks in Subject 1: ");
        int s1 = input.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int s2 = input.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int s3 = input.nextInt();

        System.out.print("Enter marks in Subject 4: ");
        int s4 = input.nextInt();

        System.out.print("Enter marks in Subject 5: ");
        int s5 = input.nextInt();

        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = total / 5.0;

        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 75) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        input.close();
    }
}
