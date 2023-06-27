package org.example;

public class MainMenu {


    private GameMaker gameMaker;
    private UI ui;


    public MainMenu(GameMaker gameMaker) {

        this.gameMaker = gameMaker;
        ui = new UI(gameMaker);
    }

    public void runMainMenu() {

            ui.displayGameRules();
        do {
            ui.displayGeneratedNumber();
            ui.displayNumberSlots();
            ui.displayPlaceNumber();

            boolean didPlaceNumber;
            do {
                String mainInput = ui.getMainMenuInput();
                try {
                    int input = Integer.parseInt(mainInput);
                    didPlaceNumber = gameMaker.isNumberInArray(String.valueOf(input));
                    if (!didPlaceNumber) {
                        ui.displayInvalidSpotMessage();
                    }
                } catch (NumberFormatException e) {
                    ui.displayInvalidInputMessage();
                    didPlaceNumber = false;
                }
            } while (!didPlaceNumber);

        } while (!gameMaker.isGameOver());

        if (gameMaker.isWinner()) {
            ui.winnerMessage();
        } else if (gameMaker.isLoser()) {
            ui.loserMessage();
        }
    }
}

