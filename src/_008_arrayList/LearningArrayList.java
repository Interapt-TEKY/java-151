package _008_arrayList;


import java.util.ArrayList;

/**
 * Created by kpascascio on 10/4/16.
 *
 * This class is our practice with ArrayList
 */
public class LearningArrayList {

    public static void main(String[] args){
//        Using the long ineffencient coding technique
//        int grade1, grade2, grade3, total;
//
//        double average;
//
//        grade1 = 78;
//        grade2 = 88;
//        grade3 = 91;
//
//        total = grade1 + grade2 + grade3;
//
//        average = total / 3;

        double average;
        int total = 0;

//        ArrayList<DataType> nameoftheArrayList = a constructor
        ArrayList<Integer> grades = new ArrayList<>();

        grades.add(78);
        grades.add(88);
        grades.add(91);

        for(int i = 0; i < grades.size(); ++i ){
            total += grades.get(i);
        }
        average = total / grades.size();
        System.out.println("The average is: " + average);


//      Create an arraylist with the people on your row,
//      then print out their names to the console.

//        Next, give a personal greeting to each of your neighbors
//
//      CHALLENGE: create a for loop that adds numbers 1- 11 to an
//      ArrayList, then print out the first and last element

//        System.out.
//        Employee e2 = new Employee("Ronald Norad", 33000, "person");
//        System.out.println(e2.displayEmployeeInfo());

    }


}
