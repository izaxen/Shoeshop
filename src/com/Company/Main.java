package com.Company;
import java.util.*;

public class Main {

    /*
    Look in readme file for task.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int price = rand.nextInt(1000) + 1;     //Creates a random price between 1-1000

        System.out.println("\n\n\n\t\t\t***Welcome to the shoeshop***\n\n");
        System.out.println("Nice pair of shoes that you chosen. \nThe price for the shoes is " + price + " kr.");
        System.out.println("\nValid money to pay with is: 1,2,5,10,20,50,100,200,500");
        System.out.println("Insert amount you want to pay with.");

        moneyMachine(price);    // Starts with method and price as ingoing int.
    }

    public static void moneyMachine(int price) {
        Scanner input = new Scanner(System.in);
        String inputMoney;
        Boolean isRunning = true;
        int moneyLeft = 0, moneySpent, count;
        int changeBack[] = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};   // Array for comparing function

        while (isRunning) {
            inputMoney = input.nextLine();

            switch (inputMoney) {   // Switch that only allows specific numbers. Since a stringbased input we don´t need any try catch
                case "1", "2", "5", "10", "20", "50", "100", "200", "500": {
                    moneySpent = Integer.parseInt(inputMoney);

                    if (moneyLeft == 0) {       //First if case necessary for the first round.

                        moneyLeft = price - moneySpent;
                        if (moneyLeft > 0) {    //If to print out if there is more money to pay from first round
                            System.out.println("You have " + moneyLeft + "kr left to pay. ");
                            System.out.println("You need to insert more money");
                        }
                    } else {
                        moneyLeft -= moneySpent;    // Recounts after more payments
                        if (moneyLeft > 0) {
                            System.out.println("You have " + moneyLeft + "kr left to pay. ");
                            System.out.println("You need to insert more money");
                        }
                    }

                    if (moneyLeft < 1) {    //When payments is done to full activates this IF

                        moneyLeft = Math.abs(moneyLeft);    //Changes moneyLeft from negativ o positive
                        System.out.println("\nThank you. Here is " + moneyLeft + "kr in change back divided in:");

                        if (moneyLeft == 0) {
                            System.out.println("Your shoes are now paid");
                            isRunning = false;
                        }


                        for (int compare : changeBack) {   //Foreach-loop that loops through the Array with comparisons numbers
                            count = 0;
                            for (int j = 0; j < 4; j++) {               //For-loop that loops through the comparision number vs moneyleft 4 times since that is max you can get as single coin
                                if (compare <= moneyLeft) {
                                    count++;
                                    moneyLeft -= compare;
                                }
                                if ((j == 3) && (count > 0)) {          // If for write out
                                    System.out.println(count + "st " + compare + "kr");
                                }
                            }
                            isRunning = false;
                        }
                    }
                    break;
                }
                default:
                    System.out.println("You didn't use valid money");
                    break;
            }
        }

    }

}






