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
public class MainMenuControl {
    String userInput;
    public String getOption(){
        Scanner input = new Scanner(System.in);
        this.userInput = input.next();
        return userInput;
    }
}
