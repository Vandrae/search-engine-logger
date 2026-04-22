package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.WeakHashMap;

public class LoggingApp {
    public static void main(String[] args) {
        //scanner so they can search for terms
        Scanner input = new Scanner(System.in);
            while (true) {
                System.out.println("""
                        What do you want to do?
                            1) Search for a Term
                            2) Read Action Log
                            0) Exit the dang app
                        """);
                int userAction = input.nextInt();

                if (userAction == 1) {
                    search();
                } else if (userAction == 2) {
                    System.out.println();
                } else if (userAction == 0) {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
            }
    }

    public static void search(){
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a search term (X to exit):");
            String userAction = input.nextLine();

            try {
                FileWriter writer = new FileWriter("src/main/resources/logs.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(writer);


                // write what they did and what time to logs.txt
                int userActions = input.nextInt();
                bufferedWriter.write(userActions);
                bufferedWriter.close();
                writer.close();

            }catch (Exception e) {
                e.getStackTrace();
            }


            // launching the application and when
            // bufferedWriter.write("Time Launch \n");
            // searching for a term and when

            //exiting the application and when

            if (userAction.equals("X")){
                break;
            }
        }

    }

    //method to log actions of the user
    //write to a file named user-actions.txt

}








