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
        System.out.println(m1.displayEmployeeInfo());
        Manager m2 = new Manager("Mathew Hamstring", 95000, "Manager","Marketing");
        System.out.println(m2.displayEmployeeInfo());

//        Creating a scanner to accept user input about how they feel about work
        Scanner input = new Scanner(System.in);
        int response;
        System.out.println("On a scale from 1 - 10 how are you feeling about work?");
        response = input.nextInt();
        System.out.println(e1.aprovalRating(response));

//        If the employee rating is less than 5 then Ask get their reason to why they feel upset



















////        Creating a loop to create many employees
//        int empNum;
//        System.out.println("How many employees would you like to create?");
//        empNum = input.nextInt();
//        ArrayList multiEmp = new ArrayList();
//        String n;
//        int s;
//        String p;
//        Character val;
////        while(multiEmp.size() - 1 < multiEmp.size() ) {
//            System.out.print("Enter Name: ");
//            n = input.nextLine();
//
////            System.out.println("\n Enter Salary: ");
////            s = input.nextInt();
////            System.out.println("\n Enter Position: ");
////            p = input.nextLine();
//            multiEmp.add(new Employee(n, 3, "it"));
//        for (employee:multiEmp){
//            System.out.println
//
//        }


//            System.out.println("Would you like to continue? y/n");
//            val = input.next().charAt(0);
//            if (val == 'n')
//                break;
//        }
    }
}
