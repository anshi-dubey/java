public class AssignmentQuestions01 {
    public static void main(String args[]) {

        // Q1 - Take 2 integer values in two variables x and y and print their product.
        int x = 3;
        int y = 4;
        System.out.println(x * y);
        // Q2 - Print the ASCII value of character ‘U’.
        int c = 'a';
        System.out.println("ASCII Value" + c);

        // Q3 - Write a Java program to take the length and breadth of a rectangle and
        // print its area.
        int l = 23;
        int b = 83;
        System.out.println("the area is : " + l * b);

        // Q4 - Write a Java program to calculate the cube of a number.
        System.out.println("cube of a number: " + x * x * x);

        // Q5 - Write a Java program to swap two numbers with the help of a third
        // variable.
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        int temp = y;
        y = x;
        x = temp;
        System.out.println("After Swaping:====");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }

}