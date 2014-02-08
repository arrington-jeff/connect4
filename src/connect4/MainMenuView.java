/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

/**
 *
 * @author Kyle
 */
public class MainMenuView {
    MainMenuControl menu = new MainMenuControl();
    String userInput;
    public void runMenu(){        
        Boolean flag = true;//Loop runs till set to false
        while (flag)
        {
            if ("1".equals(userInput)){
                flag = false;
            }
            else if ("2".equals(userInput)){
                flag = false;
            }
            else if ("H".equals(userInput)){
                flag = false;
            }
            else if ("X".equals(userInput)){
                flag = false;
            }
            else{
                this.menu();
            }
        }
    }
    public void menu(){
        System.out.println("*************************************************"
                + "********");
        System.out.println("*                 Welcome to Connect 4!          "
                + "       *");
        System.out.println("************************************************"
                + "*********");
        System.out.println();
        System.out.println();
        System.out.println("Please choose an option");
        System.out.println("1.   One player game");
        System.out.println("2.   Two player game");
        System.out.println("H    Help");
        System.out.println("X    Exit Connect 4");
        userInput = menu.getOption();
    }   
}
