package _011_Inheritance;

/**
 * Created by kpascascio on 10/4/16.
 */
public class Manager extends Employee {
    private String deparments;

    public Manager(String n, int s, String p,String d) {
        super(n, s, p);
        deparments = d;
    }

    public String displayEmployeeInfo(){
        String empInfo = super.displayEmployeeInfo();
        return empInfo + "Deparment: " + deparments + "\n";
    }
//    override the displayemployeeInformation method from the employee class
//      and add a line for department ex: Dapartment: Sales
//    then create a new manager in your main method, also change your previous manager
//    to reflect the changes

//    then make sure that name and salary is only changed by subclasses

//    Make sure we print out the position that everyone in the company has.

//    Create a new class of employee call Cashier
//    Create a method that allows the employee to rate their happiness on a scale
//    1 - 10 , anything 5 and above print "We are glad you're kinda Happy"
//    anything 4 and below "What can we do better to  help you?" allow cashier to give
//    response
//
//    When done, give only the manager rights to change an employees salary
//

}
