package _004_inputOutput;

import java.util.Scanner;

/**
 * Created by kpascascio on 10/3/16.
 *
 * Getting user data back into our program
 *
 */
public class UserInput {
    public static void main(String[] args){

//      Seen this earlier today   Integer kevin = new Integer(6);
        Scanner inputInfo = new Scanner(System.in);

        String name;
        System.out.println("Enter your name below: ");
        name = inputInfo.next();

        System.out.println("Thank you " + name);

        System.out.print(name + 40); // 1040

//      Create scanner objects that allows the user to put in their city of birth, age, and fun fact
//      Write that information to the console.
        Scanner input = new Scanner(System.in);
        Scanner inputAge = new Scanner(System.in);


        String cityBirth;
        int userAge;
        String funFact;

        System.out.println("Enter your city of birth: ");
        cityBirth = input.nextLine();
        System.out.println("Enter your age: ");
        userAge = inputAge.nextInt();
        System.out.println("Enter a fun fact: ");
        funFact = input.nextLine();

        System.out.print(cityBirth + " Is where you hail from. You are " + userAge + " years old. And a fun fact about you is " + funFact + ".");






    }
}
