/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import java.util.Scanner;

/**
 *
 * @author Kyle
 */
public class HelpMenuControl {
    String userInput;
    
    public void instructions(){
        System.out.println("To play the game each player takes turns to drop a "
                + "token down the rows and the first player to get 4 in a row, "
                + "in any direction wins.");
    }
    public void showOptions(){
        System.out.println("Please enter an option:\n"
                + "1. Show instructions\n"
                + "2. Exit");
    }
    public String getOption(){
        Scanner input = new Scanner(System.in);
        this.userInput = input.next();
        return userInput;
    }
}