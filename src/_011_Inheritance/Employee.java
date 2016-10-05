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

    protected String aprovalRating(int i){
        if(i > 5)
            return "We are glad you kind of like your job";
        else
            return "What can we do to make things better?";
    }

    protected void changeSalary(Employee e, int s){
        e.salary = s;
    }

}
