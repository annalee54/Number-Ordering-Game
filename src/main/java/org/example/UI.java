package org.example;


import java.util.Scanner;

public class UI {
    GameMaker gameMaker;
    private Scanner userInput = new Scanner(System.in);


    public UI(GameMaker gameMaker) {
        this.gameMaker = gameMaker;
    }

    public String getMainMenuInput() {
        return userInput.nextLine();
    }

    public void displayGeneratedNumber() {
        int random = gameMaker.generateRandom();
        System.out.println("Random Number Generated: " + random);


    }

    public void displayPlaceNumber() {
        try {
            System.out.print("\n" + "Please place the number in an available spot >>> ");
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number");
        }
    }

    public void displayNumberSlots() {

        int valueAt1 = gameMaker.getValueForPosition(1);
        int valueAt2 = gameMaker.getValueForPosition(2);
        int valueAt3 = gameMaker.getValueForPosition(3);
        int valueAt4 = gameMaker.getValueForPosition(4);
        int valueAt5 = gameMaker.getValueForPosition(5);


        String stringAt1 = "";
        if (valueAt1 == -1) {
            stringAt1 = "______________";
        } else {
            stringAt1 = String.valueOf(valueAt1);
        }
        String stringAt2 = "";
        if (valueAt2 == -1) {
            stringAt2 = "______________";
        } else {
            stringAt2 = String.valueOf(valueAt2);
        }
        String stringAt3 = "";
        if (valueAt3 == -1) {
            stringAt3 = "______________";
        } else {
            stringAt3 = String.valueOf(valueAt3);
        }
        String stringAt4 = "";
        if (valueAt4 == -1) {
            stringAt4 = "______________";
        } else {
            stringAt4 = String.valueOf(valueAt4);
        }

        String stringAt5 = "";
        if (valueAt5 == -1) {
            stringAt5 = "______________";
        } else {
            stringAt5 = String.valueOf(valueAt5);


            System.out.println("Please select which spot you would like to place the number: ");

        }
        System.out.println("1. " + stringAt1);
        System.out.println("2. " + stringAt2);
        System.out.println("3. " + stringAt3);
        System.out.println("4. " + stringAt4);
        System.out.println("5. " + stringAt5);


    }

    public void winnerMessage() {
        System.out.println("Congrats! You won the game :)!");
    }

    public void loserMessage() {
        System.out.println("Oh no! You lost! Better luck next time!");
    }

    public void displayInvalidSpotMessage() {
        System.out.print("Please pick a new spot >>> ");
    }

    public void displayInvalidInputMessage() {
        System.out.print("Invalid input format. Please enter a valid number >>>");
    }

    public void displayGameRules() {
        System.out.println("The game will randomly generate a number between 0 - 500 each round. Place the numbers in which you think they will rank.");
    }

}
