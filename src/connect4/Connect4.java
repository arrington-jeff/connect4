/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import java.util.Scanner;

/**
 *
 * @author Greetings My Liege and Kyle
 */
public class Connect4 {
    String name;
    String instructions = "\nThis game is Connect 4! The first player to" +
           "get 4 in a row wins!\n";  

    public static void main(String[] args) {
        Connect4 myGame = new Connect4();
        myGame.getName();
        myGame.displayHelp();
}
    
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }
    
    public void displayHelp() { 
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
}
