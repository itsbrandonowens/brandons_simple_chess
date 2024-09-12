package piece;

import main.GamePanel;

public class King extends Piece {

    public King(int color, int col, int row) {
        super(color, col, row);
        if (color == GamePanel.WHITE) {
            image = getImage("/piece/w-king");

        } else {
            image = getImage("/piece/b-king");
        }
    }

    public boolean canMove(int targetCol, int targetRow) {

        if (isWithinBoard(targetCol, targetRow)) {
            // checks for left, right, up and down movements (row 7-row 6 = 1 therefore it
            // can move) || then checks for diagonal (row ratio needs to be 1)
            if (Math.abs(targetCol - preCol) + Math.abs(targetRow - preRow) == 1 ||
                    Math.abs(targetCol - preCol) * Math.abs(targetRow - preRow) == 1) { // subtract previous position
                                                                                        // from target position ( abs
                                                                                        // gives difference between
                                                                                        // numbers and returns as full
                                                                                        // positive number)
                if (isValidSquare(targetCol, targetRow)) {
                    return true;
                }

            }
        }
        return false;
    }

}
