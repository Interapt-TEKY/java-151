package _006_loops;

import java.util.Scanner;

/**
 * Created by kpascascio on 10/3/16.
 */
public class Loops {

    public static void main(String[] args){
//        For, For Each, Do While, While

//        for(init var; relational test; modify the var){
//          **code**
//        }
//        JavaScript
        /*
        * for (var i= 0; i <= 10; i++{
        *   console.log(i)
        *
        * }
        *
        * */

        for(int i = 1; i < 11; i++){
            System.out.println(i);
        }

//        CHALLENGE: Print out Happy Day 5 times using a for loop
        for(int i = 0; i < 5; i++){
            System.out.println("Happy Day!");
        }

//        CHALLENGE 2: Create a variable that holds the sum of numbers 1 - 10 should be 55
        int sum = 0;
        for(int i = 0; i <=10; i++){
            sum = sum + i;
        }
        System.out.println("The sum of 1 - 10 is: " + sum);

        int count = 1;

        while(count < 11){
            System.out.println(count);
            count++;
        }

//        Creating a looping calculator
//        have it accept 2 numbers
//        have it accept the operator for the equation
//        make sure you have at the top 'import java.util.Scanner'
//        use the .equals method to compare values!!
//        Hint: use a while loop












        Scanner inputNum1 = new Scanner(System.in);
        Scanner inputNum2 = new Scanner(System.in);
        Scanner inputOp = new Scanner(System.in);
        double num1, num2;
        String op;

        while(true){
            System.out.print("What is your first number?");
            num1 = inputNum1.nextDouble();
            System.out.print("What is your second number?");
            num2 = inputNum2.nextDouble();
            System.out.print("Operator? + - * / %");
            op = inputOp.next();

            if(op.equals("+"))
                System.out.println(num1 + num2);
            else if (op.equals("-"))
                System.out.println(num1 - num2);
            else if (op.equals("*"))
                System.out.println(num1 * num2);
            else if (op.equals("/"))
                System.out.println(num1 / num2);
            else if(op.equals("%"))
                System.out.println(num1 % num2);
            else // This is our error handling system, so if a user puts in a false value this is the catch.
                System.out.println("You have an incorrect value, Try again");
        }




    }
}
