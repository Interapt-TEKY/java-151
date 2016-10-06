package _012_Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kpascascio on 10/6/16.
 */
public class Teacher extends SchoolPeople {
    int grade;
    ArrayList grades = new ArrayList();
    char responseGrade;
    Scanner input = new Scanner(System.in);

    public Teacher(String f, String l, String p) {
        super(f, l, p);
    }

    public void showGrades(){
        for (Object g: grades){
            System.out.println("You have entered: " + g);
        }
    }

    protected void addGrades(){
//        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Add in a student grade: ");
            grade = input.nextInt();
            grades.add(grade);

            System.out.print("Would you like to add in more grades?");
            responseGrade = input.next().charAt(0);

            if (responseGrade == 'n') {
                break;
            }
        }
        showGrades();
        System.out.println("Thank you");
//        return grades.size();
    }


}
