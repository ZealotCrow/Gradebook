package com.company;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

/**
 A program to add, remove, modify or print
 student names and grades.
 */
public class Gradebook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        String grades;

        Map<String, String> performance = new HashMap<>();

        boolean done = false;
        while (!done) {
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();

            if (input.equals("A")) {

                //I want to include as much code inside the if-statements as humanly possible
                System.out.println("Please enter the name and grade of the student.");
                 name = in.next();
                 grades = in.next();
                performance.put(name, grades);


            }
            else if (input.equals("R")) {
                System.out.println("Please enter name");
                name = in.next();
            performance.remove(name);
            }
            else if (input.equals("M")) {
                System.out.println("Please enter a new name and grade");

                name = in.next();
                grades = in.next();
                performance.put(name, grades);
            }
            else if (input.equals("P")) {
                //This will display all names and grades entered
                System.out.println(performance);

            }
            else if (input.equalsIgnoreCase("Q")) {
                done = true;
            }
            else {
                done = true;
                }
            }
        }
    }

