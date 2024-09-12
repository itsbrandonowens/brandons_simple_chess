package piece;

import main.GamePanel;

public class Queen extends Piece {

    public Queen(int color, int col, int row) {
        super(color, col, row);
        if (color == GamePanel.WHITE) {
            image = getImage("/piece/w-queen");

        } else {
            image = getImage("/piece/b-queen");
        }
    }

    public boolean canMove(int targetCol, int targetRow) {
        if (isWithinBoard(targetCol, targetRow) && isSameSquare(targetCol, targetRow) == false) {

            // Vertical & Horizontal (Same as Rook)
            if (isWithinBoard(targetCol, targetRow) && isSameSquare(targetCol, targetRow) == false) {
                if (targetCol == preCol || targetRow == preRow) {// Can move along same column
                    if (isValidSquare(targetCol, targetRow) && pieceIsOnStraightLine(targetCol, targetRow) == false) {
                        return true;
                    }

                }

            }
            // Diagonal (Same as Bishop)
            if (Math.abs(targetCol - preCol) == Math.abs(targetRow - preRow)) { // difference between columns and
                                                                                // difference between rows must be equal
                                                                                // to move diagonally
                if (isValidSquare(targetCol, targetRow) && pieceIsOnDiagonalLine(targetCol, targetRow) == false) {
                    return true;
                }
            }
        }
        return false;
    }

}
