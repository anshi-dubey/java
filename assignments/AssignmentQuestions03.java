import java.util.Scanner;

public class AssignmentQuestions03 {
    public static void main(String[] args) {
        // Q1 - Write a program which takes the values of length and breadth from user
        // and check if it is a square or not.
        Scanner object = new Scanner(System.in);
        System.out.print("Enter breath: ");
        int b = object.nextInt();

        System.out.print("Enter lenght: ");
        int l = object.nextInt();
        if (b == l) {
            System.out.println("Given values are sides of square");
        } else {
            System.out.println("Given values are not sides of square");
        }

        // Q2 - Write a program to print absolute value of a number entered by the user
        System.out.print("Enter number: ");
        int num = object.nextInt();
        if (num < 0) {
            num = num * (-1);
        }
        System.out.println("absolute value is: " + num);

        // Q3 - Write a program to take input from user for Cost Price (C.P.) and
        // Selling Price(S.P.) and calculate Profit or Loss.
        System.out.print("Enter Cost Price: ");
        int cp = object.nextInt();

        System.out.print("Enter Selling Price: ");
        int sp = object.nextInt();
        if (cp > sp) {
            int amt = cp - sp;
            System.out.println("The loss is: " + amt);

        } else if (cp < sp) {
            int amt = sp - cp;
            System.out.println("The profit is: " + amt);
        } else {
            System.out.println("No Profit and Loss");
        }

        // Q4 - Write a program to print positive number entered by the user, if user
        // enters a negative number, it is skipped.
        System.out.print("Enter number {negative number will skip}: ");
        int n = object.nextInt();
        if (n > 0) {
            System.out.println("the Number is: " + n);
        } else {
            System.out.println("negative number skipped");
        }

        // 5 - Create a calculator using switch statement to perform addition,
        // subtraction, multiplication and division
        System.out.print("Enter number1: ");
        int op1 = object.nextInt();
        System.out.print("Enter operator(+/*-): ");
        String operator = object.next();
        System.out.print("Enter number2: ");
        int op2 = object.nextInt();
        switch (operator) {
            case "+":
                System.out.println(op1 + " + " + op2 + " = " + (op1 + op2));
                break;
            case "*":
                System.out.println(op1 + " * " + op2 + " = " + (op1 * op2));
                break;
            case "-":
                System.out.println(op1 + " - " + op2 + " = " + (op1 - op2));
                break;
            case "/":
                System.out.println(op1 + " / " + op2 + " = " + (op1 / op2));
                break;

            default:
                System.out.println("enter a valid operator");
                break;
        }

        // Q6 - Write a program to calculate marks to grades . Follow the conversion
        // rule as given below :
        
        int marks;

        System.out.print("Enter the marks : ");

        marks=object.nextInt();

        if(marks>=90)

        {

            System.out.print("Your Grade is A+");

        }else if(marks>=80)

        {

             System.out.print("Your Grade is A");

        }else if(marks>=70)

        {

             System.out.print("Your Grade is B+");

        }else if(marks>=60)

        {

             System.out.print("Your Grade is B");

        }else if(marks>=50)

        {

             System.out.print("Your Grade is C");

          }else if(marks>=40)

        {

             System.out.print("Your Grade is D");

          }else if(marks>=30)

        {

             System.out.print("Your Grade is E");

        }else if(marks<30){

             System.out.print("Your Grade is f");

        }else{

             System.out.print("Enter valid marks");
        }

    }
}