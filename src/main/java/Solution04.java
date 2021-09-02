/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Glaspey
 */

import java.util.Scanner;

public class Solution04 {
    /*
    Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.
        'noun', 'verb', 'adverb', 'adjective' = Inputted strings from user
        print "Enter noun: "
        print "Enter verb: "
        print "Enter adjective: "
        print "Enter adverb: "
        print "Do you 'verb' your 'adjective' 'noun' 'adverb'? That's hilarious!"
     */

    public static void main(String[] args) {

        //declare variables
        Scanner in = new Scanner(System.in);
        String noun, verb, adverb, adjective;

        //store noun
        System.out.printf("Enter a noun: ");
        noun = in.nextLine();
        //store verb
        System.out.printf("Enter a verb: ");
        verb = in.nextLine();
        //store adjective
        System.out.printf("Enter an adjective: ");
        adjective = in.nextLine();
        //store adverb
        System.out.printf("Enter an adverb: ");
        adverb = in.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!",verb,adjective,noun,adverb);
    }
}
