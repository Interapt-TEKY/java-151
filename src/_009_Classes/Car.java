package _009_Classes;

import java.util.ArrayList;

/**
 * Created by kpascascio on 10/4/16.
 */
public class Car {

    public String make;
    String model;
    int year;
    ArrayList<String> owners = new ArrayList<>();
    boolean isOn;
    int wheels;

//    function name(string) {
//    ****
//    }

    public void makeNoise(String noise){
        if(isOn){
            System.out.println(noise);
        }
    }
//    CHALLENGE: Make a method that check if the car has a certain
//    amount of wheels, that it tells the user what kind of car it is



    public void typeWheels(int number){

    }

}
