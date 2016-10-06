package _012_Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kpascascio on 10/6/16.
 */
public class Student extends SchoolPeople{
    int grade;
    ArrayList<Integer> grades = new ArrayList<>();
    char responseGrade;
    Scanner input = new Scanner(System.in);

    public Student(String f, String l, String p) {
        super(f, l, p);
    }

    public void averageGrades(ArrayList g){
//        System.out.println(g.get(0));
        int sum = 0;

        for( int i = 0; i < g.size(); ++i){
            int num = Integer.parseInt(g.get(i).toString());
            sum += num;
//            sum += g.get(i);
        }
        System.out.println(" The Average is: " + sum / g.size());
    }

    protected void addGrades(){
        while(true) {
            System.out.println("Add in grades to find out average: ");
            grade = input.nextInt();
            grades.add(grade);

            System.out.print("Would you like to add in more grades?");
            responseGrade = input.next().charAt(0);

            if (responseGrade == 'n') {
                System.out.println("Thank you");
                break;
            }
        }
        averageGrades(grades);
    }

}


















