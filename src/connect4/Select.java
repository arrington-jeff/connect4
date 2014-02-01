/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import java.util.Scanner;

/**
 *
 * @author Greetings My Liege
 */
public class Select {
    int players = 2;
    String name;
    int difficulty;
    
    public void difficulty() {
        System.out.println(name + ", how difficult do you want"
                + "your opponent to be? Choose 1-5");
        // Holding, Debugging * Scanner this.difficulty = new Scanner(System.in);
        if (difficulty == 1) {
            System.out.println("A very easy opponent");
        }
        if (difficulty == 2) {
            System.out.println("An easy opponent");
        }
        if (difficulty == 3) {
            System.out.println("A moderately skilled opponent");
        }
        if (difficulty == 4) {
            System.out.println("A difficult opponent");
        }
        if (difficulty == 5) {
            System.out.println("An expert opponent; be careful!");
        }

    GameBoard newGame = new GameBoard();
    newGame.newBoard();
    }
}
