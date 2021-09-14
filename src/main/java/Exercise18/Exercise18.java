/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package Exercise18;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner temperature = new Scanner(System.in);

        System.out.print("If you wish to convert Fahrenheit to Celsius type F: ");

        String f_select = temperature.nextLine();

        System.out.print("If you wish to convert Celsius to Fahrenheit type C: ");

        String c_select = temperature.nextLine();

        int F;

        int C;


        if(c_select.compareTo("C") == 0 | c_select.compareTo("c") == 0){

            System.out.print("Your Choice was C: \n");

            System.out.print("Please enter in the Celsius Temperature: ");

            int c_temp = temperature.nextInt();

            F = (c_temp * 9 / 5) + 32;

            System.out.printf("The temperature in Fahrenheit is %d: ", F);


        }

        if(f_select.compareTo("F") == 0 | f_select.compareTo("f") == 0){

            System.out.print("Your Choice was F: \n");

            System.out.print("Please enter in the Fahrenheit Temperature: ");

            int f_temp = temperature.nextInt();

            C = (f_temp - 32) * 5 / 9;

            System.out.printf("The temperature in Fahrenheit is %d: \n", C);


        }

        if(f_select.compareTo("F") != 0 & f_select.compareTo("f") !=0 & c_select.compareTo("C") != 0 & c_select.compareTo("c") != 0) {

            System.out.print("Please Follow the Prompt :  ^) and try again. ");
        }
    }
}
