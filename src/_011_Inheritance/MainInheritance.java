package _011_Inheritance;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by kpascascio on 10/4/16.
 */
public class MainInheritance {
    public static void main(String[] args){
        Date date = new Date();

        // display time and date using toString()
        System.out.printf("%s %tr", "Checked in time: ", date);
        System.out.print("\n");


        Employee e1 = new Employee("Kenn Pascascio", 155000, "Contractor");

//        VS.

        Employee.createEmployee("Kenn", 322, "it");



        System.out.println(e1.hasRec('y'));

        Manager m1 = new Manager("Brian Gilligan", 70000,"Manager", "IT");
//        m1.createCashiers("Ben", 23000, "lane 3");


//        System.out.println(m1.changeName(e1, "Ralf Jeggings"));
//
//        System.out.println(System.out.println("From Thence on he shall be known as: "))
        Cashier c1 = new Cashier("Ronald", 32000, "Lane 2");

        m1.changeSalary(c1,33000);
        System.out.println(e1.displayEmployeeInfo());


        System.out.println(m1.displayEmployeeInfo());
        Manager m2 = new Manager("Mathew Hamstring", 95000, "Manager","Marketing");
        System.out.println(m2.displayEmployeeInfo());

//        Creating a scanner to accept user input about how they feel about work
        Scanner input = new Scanner(System.in);
        int response;
        System.out.println("On a scale from 1 - 10 how are you feeling about work?");
        response = input.nextInt();
        System.out.println( e1.approvalRating(response, e1.name));


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
