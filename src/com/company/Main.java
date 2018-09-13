package com.company;

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

        if (sign.equals("add")) {
            signWord = "sum";
        } else if (sign.equals("subtract")) {
            signWord = "difference";
        } else if (sign.equals("multiply")) {
            signWord = "product";
        } else if (sign.equals("divide")) {
            signWord = "dividend";
        } else {
            System.out.println("Sorry, I did not get that. Try again.");
        }

        System.out.println("The " + signWord + " of " + num1 + " and " + num2 + " is " + Math.pow(num1, num2) + ". Are you satisfied?");

        String answerSatisfied = kbReadingString.next();

        if (answerSatisfied.equals("no")) {
            System.out.println("Can you identify what math class method I ran the real answer through?");
        } else {
            System.out.println("Ha! I lied to you!");
        }

        String realSign = kbReadingString.next();

            if (realSign.equals("pow")) {
                System.out.println("Great! Good job and goodbye!");
            }
            else {
                System.out.println("Wrong! Sorry, you only get one try...");
            }

        }
    }


