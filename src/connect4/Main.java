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

public class Main {
    String startGame;
    String select;
    String options ="default";
    
    public static void main(String[] args) {
        Connect4 myGame = new Connect4();
        myGame.playNow();
        myGame.select();        
    }
    public void select() {
        Select choice = new Select();
        choice.difficulty();
        System.out.println("Vs. Computer");
        System.out.println("Vs. Local Opponent");
        System.out.println("Vs. Online Opponent");
        System.out.println("What type of game would you like to play?");
        Scanner input = new Scanner(System.in);
    }
    public void playNow() {
        GameBoard newGame = new GameBoard();
        newGame.newBoard();
    }
    *  */