/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import java.util.Scanner;

/**
 *
 * @author Kyle Eslick
 */
public class Options {
    boolean music = true;
    boolean hints = true;
    String userInput;
   
    public void getOptions() {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want music y/n?: ");
        this.userInput = input.next();
        
        if (userInput == "y") {
            music = true;
        }
        else {
            music = false;
        }
        
        Scanner input2 = new Scanner(System.in);
        System.out.println("Do you want hints y/n?: ");
        this.userInput = input2.next();
        
        if (userInput == "y") {
            hints = true;
        }
        else {
            hints = false;
        }
    }    
}
