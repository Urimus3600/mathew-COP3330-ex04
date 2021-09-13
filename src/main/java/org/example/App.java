/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */

package org.example;
import java.text.MessageFormat;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String  noun = input.next();

        System.out.print("Enter a verb: ");
        String  verb = input.next();

        System.out.print("Enter a adjective: ");
        String  adjective = input.next();

        System.out.print("Enter a adverb: ");
        String  adverb = input.next();

        System.out.println(String.format("How could the %s %s %s so %s? How quaint.",
                adjective, noun, verb, adverb));
        /**
         * could also use
         * System.out.println(MessageFormat.format("How could the {0} {1} {2} so {3}? How quaint.",
         *      adjective, noun, verb, adverb));
         */

    }
}
