package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class LoggingApp {
    public static void main(String[] args) {
        //scanner so they can search for terms
        Scanner input= new Scanner(System.in);

        System.out.println("""
      What do you want to do?
          1) Search for a Term
          2) Read Action Log
          0) Exit the dang app
      """);
        int userAction = input.nextInt();

        if (userAction==1) {
            System.out.println();
        } else if (userAction == 2) {
            System.out.println();
        }else if (userAction == 0) {
            System.out.println("Goodbye!");
            System.exit(0);
        }


        try {
            FileWriter writer = new FileWriter("src/main/resources/logs.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

        }catch (Exception e) {
            e.getStackTrace();
        }
    }
    //method to log actions of the user
    //write to a file named user-actions.txt
    //actions logged should be
    //launching the application and when
    //searching for a term and when
    //exiting the application and when

}








