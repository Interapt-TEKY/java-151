package _012_Polymorphism;

/**
 * Created by kpascascio on 10/6/16.
 */
public class SchoolPeople {
    String firstName;
    String lastName;
    String position;

    public SchoolPeople(String f, String l, String p){
        firstName = f;
        lastName = l;
        position = p;
    }

    public String getFullName(){
        return firstName + lastName;
    }

    public String getPosition(){
        return position;
    }

    public String displaySchoolInfo(){
        return "Name: " + getFullName() + "\n" +
                "Position: " + getPosition() + "\n";
    }




}
