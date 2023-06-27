package org.example;

public class Main {


    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {

        GameMaker gameMaker = new GameMaker();
        MainMenu mainMenu = new MainMenu(gameMaker);

        // run menu
        mainMenu.runMainMenu();
    }
}