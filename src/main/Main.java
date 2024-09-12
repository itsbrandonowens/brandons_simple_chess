package main;

import javax.swing.JFrame;

public class Main {
//https://www.youtube.com/watch?v=jzCxywhTAUI
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
