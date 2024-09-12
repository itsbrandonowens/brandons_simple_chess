package piece;

import main.GamePanel;

public class Knight extends Piece{

    //Constructor
    public Knight(int color, int col, int row) {
        super(color, col, row);
        if(color == GamePanel.WHITE){
            image = getImage("/piece/w-knight");
            
        } else {
            image = getImage("/piece/b-knight");
        }
    }

    public boolean canMove(int targetCol, int targetRow){
        if(isWithinBoard(targetCol, targetRow)){

            //knight can move if its movement ration of col and row is 1:2 or 2:1
            if(Math.abs(targetCol-preCol) * Math.abs(targetRow-preRow)== 2){
                if(isValidSquare(targetCol,targetRow)){
                    return true;
                }
            }

        }
        return false; 
    }
}
