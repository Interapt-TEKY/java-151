package _005_conditionals;
import java.util.Scanner;

/**
 * Created by kpascascio on 10/3/16.
 */
public class Conditionals {
/*
JavaScript equivalent:
    if (expression equals true or false){

        **Code here**
    }
 */
    public static void main(String[] args){
        boolean saladForLunch = false;

        if (saladForLunch)
            System.out.println("Man you are getting healthy");
        else
            System.out.println("Should've had a V8");

        /*
	        CHALLENGE: I want to order some Colts gear online, and I'm not sure
	        which courier service to use yet. I want to know which one to use
	        for Next Day Air, 2 day air, 3 day ground, and whenever. Can you write
	        an if/else statement that helps me pick the best one? It's just your opinion here.
	    */

        String order = "Arrive Whenever";
        String courierService;

        if (order == "Next Day Air")
            courierService = "Fed Ex";
        else if (order == "Two Day Air")
            courierService = "Fed Ex";
        else if (order == "Arrive Whenever");
            courierService = "UPS Ground";

        System.out.println(courierService);




//      Create a scanner object to allow a user to input a password, then check if that password matches the
//      stored password variable.

        String storedPassword = "password";
        String password;

        Scanner inputPassword = new Scanner(System.in);
        System.out.println("Please enter your password:");
        password = inputPassword.nextLine();

        if (password.equals(storedPassword))
            System.out.print("You are logged in");
        else
            System.out.print("Login in Failed");
    }
}
