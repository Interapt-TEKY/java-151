package _009_Classes;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kpascascio on 10/4/16.
 */
public class LearningClasses {

    public static void main(String[] args){

        Car tesla = new Car();
        tesla.make = "Tesla";
        tesla.model = "Tesla III";
        tesla.year = 2017;
        tesla.owners.addAll(Arrays.asList("Kenn", "Dave", "Susan"));
        System.out.println(tesla.owners.get(1));
        tesla.isOn = true;
        tesla.makeNoise("Honk");

        System.out.println(tesla.make);

        int num = 12;
        System.out.println(num + " squared equals " + square(num));

//        modify this solution for user input.

//        when done, try to make the prompt loop over hint think of our looping calculator.

//        CHALLENGE: Make a method that checks if a letter is a vowel
//        CHALLENGE: make a method that counts all vowels in a sentence given by
//        User input. Also loops the prompt

//        Scanner input = new Scanner(System.in);
//        String sentence, word;
//        int count = 0;
//        while(true) {
//            System.out.print("Enter your Sentence: ");
//            sentence = input.nextLine().toLowerCase();
//            for (int i = 0; i < sentence.length(); ++i) {
//                if (isVowel(sentence.charAt(i)))
//                    ++count;
//            }
//            System.out.println("There are " + count + " vowels in: " + sentence);
//
//            System.out.println("Do you want to continue? y/n");
//            word = input.next();
//            if (word.equals("n"))
//                break;
//        }
//        CHALLENGE: Write a method that changes Fahrenheit to Celsius, Allow user inputx
        Scanner inputTemp = new Scanner(System.in);
        double ftemp, ctemp;
        System.out.print("Enter a temperature in Fahrenheit: ");
        ftemp = inputTemp.nextDouble();
        ctemp = ftoc(ftemp);
        System.out.println(ftemp + " F is equal to " + ctemp + " C.");
    }

    static boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
            return true;
        else
            return false;

    }

    static int square(int number){
        return number *number;
    }
    static double ftoc(double temp){
        double celsius;
        celsius = (temp - 32.0) * (5.0 / 9.0);
        return celsius;
    }


}
/*
*   commit your new changes to your local repo
*   Create a new package
*   create a main class for LearningInheritance with
*     a main method inside the package
*   create a class for Employee inside the package
*   create a class for Manager inside the package
*
* */