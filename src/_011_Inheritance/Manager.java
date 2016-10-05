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
        String empInfo = super.displayEmployeeInfo() + "Deparment: " + deparments + "\n";
        return empInfo;
    }

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
//
//
//

//
//   give only the manager rights to change an employees salary
//

}
