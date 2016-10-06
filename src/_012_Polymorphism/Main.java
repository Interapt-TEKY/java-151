package _012_Polymorphism;

/**
 * Created by kpascascio on 10/6/16.
 */
public class Main {
    public static void main(String[] args){

        System.out.println("Hey teacher please enter some grades in your grade book.");
        Teacher t1 = new Teacher("Kenn", "Pascascio", "7th Grade");
//        t1.addGrades();

        System.out.println("Hey student it's your turn.");
        Student s1 = new Student("Bradon", "Sheilds", " 3rdgrade");
//        s1.addGrades();

        SchoolPeople.lastName = "Pascascio";

        Teacher t2 = new Teacher("Roger", SchoolPeople.lastName, "7th Grade");
        System.out.println(t2.displaySchoolInfo());



    }
}
