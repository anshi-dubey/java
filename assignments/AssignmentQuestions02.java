import java.util.Scanner;

public abstract class AssignmentQuestions02 {
    public static void main(String args[]) {
        // Input name, roll number and field of interest from user and print in the
        // format below :Name: xyz, Roll number: xyz, Field of interest: xyz

        try (Scanner obj1 = new Scanner(System.in)) {
            System.out.println("Enter Name: ");
            String nme = obj1.nextLine();
            System.out.println("Enter rollno: ");
            int rllno = obj1.nextInt();
            System.out.println("Field of interest: ");
            String intrest = obj1.next();
            System.out.println("Name :" + nme + ", Roll number :" + rllno + ", Field of interest :" + intrest);
        }
        ;

        // // Input two different string and print them in same line.

        try (Scanner obj2 = new Scanner(System.in)) {
            String first = obj2.next();
            String second = obj2.next();
            System.out.print(first + " " + second);
        }
        ;
        // If the marks of Robert in three subjects are entered through keyboard (each
        // out of 100), write a program to calculate his total marks and percentage
        // marks.

        try (Scanner obj3 = new Scanner(System.in)) {
            System.out.println("Enter your Marks of Subject 1:");
            Float m1 = obj3.nextFloat();
            System.out.println("Enter your Marks of Subject 2:");
            Float m2 = obj3.nextFloat();
            System.out.println("Enter your Marks of Subject 3:");
            Float m3 = obj3.nextFloat();
            float total = m1 + m2 + m3;
            double percen = (total / 3) * 100;
            System.out.println("percentage of all three subjects are: " + total);
            System.out.println("percentage of all three subjects are: " + percen);
        }
        ;
        // Given two numbers, return their sum in the following format: Int t
        // representing number of test cases
        // T lines of Two integers representing the numbers to be added

        System.out.print("enter no of times you want to add: ");
        try (Scanner obj4 = new Scanner(System.in)) {
            int T = obj4.nextInt();
            for (int i = 0; i < T; i++) {
                System.out.print("num1: ");

                int num1 = obj4.nextInt();
                System.out.print("num2: ");

                int num2 = obj4.nextInt();
                System.out.println(num1 + num2);

            }

        }
        ;
        // Given few lines of input(number of lines unknown) where each line has two
        // strings, concatenate the strings

        try (Scanner scn = new Scanner(System.in)) {
            while (scn.hasNextLine()) {
                String a = scn.next();
                String b = scn.next();
                System.out.println(a + b);

            }
        }
        ;
    }
}
