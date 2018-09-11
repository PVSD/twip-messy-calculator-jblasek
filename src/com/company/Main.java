package com.company;
import java.util.Scanner;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner kbReadingString = new Scanner(System.in);
        Scanner kbReadingInt = new Scanner(System.in);


        System.out.println("Do you want to add, subtract, divide, or multiply.");

       String sign = kbReadingString.next();
        System.out.println("Type in your two numbers.");

        int num1 = kbReadingInt.nextInt();
        int num2 = kbReadingInt.nextInt();

        String signWord = "";

        if (sign == "add") {
            signWord = "sum";
        }
        else if (sign == "subtract") {
            signWord = "difference";
        }
        else if (sign == "multiply") {
            signWord = "product";
        }
        else if (sign == "divide"){
            signWord = "dividend";
        }
        System.out.println("The" + signWord + "of " + num1 + "and" + num2);

    }
}
