package main;

import javax.swing.JFrame;

/*
 * Brandon's Simple Chess
 * This is a fully working game of chess including all features such as promotion, en passant and castling.
 * This was created during my re-upskilling in Java to ensure that I increase my level of understanding 
*/
public class Main {
    public static void main(String[] args) {
        
        JFrame window = new JFrame("Brandon Atkinson's Simple Chess");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        //Add Game Panel to the window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gp.launchGame();
    }

}
