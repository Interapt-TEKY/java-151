package _011_Inheritance;

import java.util.Scanner;

/**
 * Created by kpascascio on 10/4/16.
 */
public class MainInheritance {
    public static void main(String[] args){

        Employee e1 = new Employee("Kenn Pascascio", 155000, "Contractor");

        System.out.println(e1.hasRec('y'));

        Manager m1 = new Manager("Brian Gilligan", 70000,"Manager", "IT");


//        System.out.println(m1.changeName(e1, "Ralf Jeggings"));
//
//        System.out.println(System.out.println("From Thence on he shall be known as: "))


        m1.changeSalary(e1,33000);
        System.out.println(e1.displayEmployeeInfo());


        System.out.println(m1.displayEmployeeInfo());
        Manager m2 = new Manager("Mathew Hamstring", 95000, "Manager","Marketing");
        System.out.println(m2.displayEmployeeInfo());

//        Creating a scanner to accept user input about how they feel about work
        Scanner input = new Scanner(System.in);
        int response;
        System.out.println("On a scale from 1 - 10 how are you feeling about work?");
        response = input.nextInt();
        System.out.println(e1.aprovalRating(response));


//
//
//
//
//
//
//
//
//
//
// Lets add our files from yesturday and commit them.
//      If the employee rating is less than 5 then Ask get their reason to why they feel upset



//
// Create a School class that holds the main block of code that we will be using to build our SchoolPeople class
//        that has 2 subclasses of Students, and Administration.
//




    }
}
