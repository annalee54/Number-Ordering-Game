package org.example;

public class GameMaker {


    int numberPlacement [] = {-1, -1, -1, -1, -1};

    private int random;

    int min = 0;
    int max = 500;

    public int generateRandom() {
        random = (int) ((Math.random() * (max - min)) + min);
        return random;
    }



    public boolean isNumberInArray(String indexAtWhich) {

            if (numberPlacement[Integer.parseInt(indexAtWhich) - 1] != -1) {
                return false;
            } else {
                numberPlacement[Integer.parseInt(indexAtWhich) - 1] = random;
                return true;
            }

        }

    public int getValueForPosition(int index) {
        return numberPlacement[index - 1];
    }

    public boolean isGameOver() {
        if (isWinner()) {
            return true;
        }
        if (isLoser()) {
            return true;
        } return false;
    }

    public boolean isWinner() {
        if ((getValueForPosition(1) < getValueForPosition(2) && (getValueForPosition(2) >= 0) && (getValueForPosition(1) >= 0)
                && (getValueForPosition(1 ) >= 0
            && (getValueForPosition(2) < getValueForPosition(3) && (getValueForPosition(3) >= 0 || getValueForPosition(2) == -1))

            && (getValueForPosition(3) < getValueForPosition(4) && (getValueForPosition(4) >= 0 || getValueForPosition(3) == -1))
                && (getValueForPosition(4) < getValueForPosition(5) && (getValueForPosition(5) >= 0 || getValueForPosition(4) == -1))

        && (getValueForPosition(5 ) >= 0 || getValueForPosition(5) == -1)))) {
            return true;

        }
        return false;
    }

    public boolean isLoser() {
        if (getValueForPosition(1) > getValueForPosition(2) && getValueForPosition(2) >= 0) {
            return true;
        } else if (getValueForPosition(2) > getValueForPosition(3) && getValueForPosition(3) >= 0) {
            return true;
        } else if (getValueForPosition(3) > getValueForPosition(4) && getValueForPosition(4) >= 0) {
            return true;
        } else if (getValueForPosition(4) > getValueForPosition(5) && getValueForPosition(5) >= 0) {
            return true;

        }
        return false;
    }
}
