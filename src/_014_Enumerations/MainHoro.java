package _014_Enumerations;

import java.util.Scanner;

/**
 * Created by kpascascio on 10/6/16.
 */
public class MainHoro {
//    CHALLENGE:
    String res;
    public static void main(String[] args) {
//    Create a scanner object that prompts the user to input a sign
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your sign: ");

        AstrologicalSign newSign = AstrologicalSign.valueOf(scanner.next().toUpperCase());
        System.out.print("Your sign is for the month of: " + newSign.getHoroSign());
//
//        if (AstrologicalSign.getMonth("July") == AstrologicalSign.getHoroSign()){
//
//        }


    }
}
