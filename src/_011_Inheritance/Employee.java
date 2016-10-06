package _011_Inheritance;
/**
 * Created by kpascascio on 10/4/16.
 */
public class Employee {
    protected double salary;
    protected String name;
    protected String position;

    public Employee(String n, double s, String p) {
        name = n;
        salary = s;
        position = p;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public String getPosition(){
        return position;
    }


    public String displayEmployeeInfo(){
        return "Name: " + name + "\n" +
                "Salary: " + salary + "\n" +
                "Position: " + position + "\n";
    }

    public String hasRec(char i){
        if(i =='y'){
            return displayEmployeeInfo();
        } else
            return "not valid";
    }

    protected static void createEmployee(String n, double s, String p){
        Employee e1 = new Employee(n, s, p);
        System.out.println(e1.displayEmployeeInfo());
    }




    protected String approvalRating(int i, String n){
        if(i > 5)
            return "We are glad you kind of like your job " + n;
        else
            return "What can we do to make things better " + n + "?";
    }


//    CHALLENGE: MAKE THE MANAGER CLASS ONLY CHANGE THE SALARY FOR THE CASHIER CLASS

//    CHALLENGE: MAKE A METHOD THAT HANDLES CREATING A NEW EMPLOYEE

/*
* Challenge: Create a new package for the game blackjack, inside
* Create classes:
*   Main
*   Card
*   Deck
*   Suit
*   Value
*
*
*
*
*
*
* */

}











