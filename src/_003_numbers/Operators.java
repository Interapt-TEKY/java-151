package _003_numbers;

/**
 * Created by kpascascio on 10/3/16.
 */
public class Operators {

    public static void main(String[] args){
//        Exercise #1: Write variables for age, birthYear, daysYouveProgrammed, numSiblings.
        int myAge = 48;
        int myBirthYear = 1834;
        int beenProgramming = 60235;
        int numSiblings = 5;

        int ten = 5 + 5;

//       EXAMPLE: int daysForVacation = UserNumber.vacationDays - UserNumber.daysTaken;

        System.out.println(ten);
// i = i + 1
        int increment  = ten++; //ten(5 + 5) ten = ten + 1

        int twoIncrement = ++ten;
        System.out.println(increment);
        System.out.println(twoIncrement);

        double bankBalance;

        double shoes = 389.99;
        // what's wrong with the first line of code?
        double shirt = 123.99;
        double pants = 513.00;

        bankBalance = 50000;

        double afterShoppingBalance = bankBalance - shoes - shirt - pants;

        System.out.println(afterShoppingBalance);

        // What is our total? --> 1910.01
        bankBalance = afterShoppingBalance;
        // stress the importance of changing this value

        //It's payday
        bankBalance = bankBalance + 2000;
        System.out.println(bankBalance);

        // Things to take note, the value of bankBalance changing each step.
        // How does the computer see work through that problem?

        // The wife says she's unhappy, and wants to split
        bankBalance = bankBalance / 2;
        System.out.println(bankBalance);



        bankBalance = bankBalance * 10;
        System.out.println(bankBalance);

        // Your ex-wife is back she wants not only divide your 7 vacation properties 3 but she convinces the judge to only let you have the remainder
        int vacationCondos = 7;

        vacationCondos = vacationCondos % 3;

        System.out.println(vacationCondos);



    }
}
