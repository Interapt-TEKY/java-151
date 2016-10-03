package _002_Variables;

/**
 * Created by kpascascio on 10/3/16.
 *
 * This we are going over basic concepts on variables
 */
public class BasicConcepts {

    static String firstName = "Kenn";

    public static void main(String[] args){
        //    JavaScript version of a variable = var userName = "Kenn";

//    Java equivalent
        String userName = "Kenn";
        double newNumber = 4.9;
        int thisNumber = 2;
        boolean toBeOrNotToBe = false;
        Integer numofSalads = new Integer(7);


//  CHALLENGE: Print these variables to the console
        System.out.println(userName);
        System.out.println(newNumber);
        System.out.println(toBeOrNotToBe);

        System.out.println(numofSalads);

        newNumber = 78;

        System.out.println(firstName);


    }

}
