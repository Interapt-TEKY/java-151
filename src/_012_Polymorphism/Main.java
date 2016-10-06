package _012_Polymorphism;

/**
 * Created by kpascascio on 10/6/16.
 */
public class Main {
    public static void main(String[] args){

        System.out.println("Hey teacher please enter some grades in your grade book.");
        Teacher t1 = new Teacher("Kenn", "Pascascio", "7th Grade");
        t1.addGrades();

        System.out.println("Hey student it's your turn.");
        Student s1 = new Student("Bradon", "Sheilds", " 3rdgrade");
        s1.addGrades();

    }
}
