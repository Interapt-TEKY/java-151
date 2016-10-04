package _008_arrayList;
import java.util.ArrayList;

/**
 * Created by kpascascio on 10/4/16.
 */
public class arrayList {
    public static void main(String[] args){
        /*
        * The arraylist is a way to store multiple values under the same name. That provides lots of efficiencies!
        * To demonstrate how that works I'll show you what you missing when you don't use an arraylist or some type of
        * data structure to store related values, then I'll contrast that.
        *
        * Say we are a teacher and we would like to store grades so that we can compute the average on a test. I'm only
        * going to keep track of 3 grades
        * */


//      First I need to import the Scanner Class

//       Second I need grade variables then the total
        int grade1, grade2, grade3, total;

//        I will need a average to store the average
        double average;

        grade1 = 78;
        grade2 = 88;
        grade3 = 91;

        total = grade1 + grade2 + grade3;

        average = total / 3;

//        Now this looks very simple so far, But imagine if I had a total of 70 students, something like this would
//        get very complicated, and would create a big problem.

//        Well an easier way to do this is to use an ArrayList

//        First import the class of Array List
//        I would still need an average, and a total
        double newAverage;
        int newTotal = 0;
//        Now to declare my array list I need to tell it what type of data that it needs to handle
//        ArrayList <DataType> nameofArrayList = a constructor
//        !!!!!!!!!Don't call the file name ArrayList!!!!!!!!!
        ArrayList<Integer> grades = new ArrayList<>();
//        Think of a box as your adding values.
        grades.add(78);
        grades.add(88);
        grades.add(91);

//        Now I can create a for loop that adds all that values together
        for(int i = 0; i < grades.size(); ++i)
//            using a method on the ArrayList class called get
            newTotal += grades.get(i);
        newAverage = newTotal / grades.size();
        System.out.println("The average is " + newAverage);

//        CHALLENGE: create a for loop that adds numbers 1- 11 to an ArrayList, then print out the first and last element
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1; i < 12; ++i){
            numbers.add(i);
        }
        System.out.println("The First element is: " + numbers.get(0));
        System.out.println("The Last element is: " + numbers.get(numbers.size() - 1));

//        CHALLENGE 2: Add each element together in the arraylist that you previously made using a for loop
        int sum = 0;
        for (int i = 0; i < numbers.size(); ++i){
            sum += numbers.get(i);
        }

        System.out.println("The total of numbers 1 - 11 is: " + sum);


//        Next we are going to

    }
}
