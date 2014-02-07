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
public class HelpMenuView {
    HelpMenuControl help = new HelpMenuControl();
    
    public void showView(){
        help.showOptions();
        String userInput = help.getOption();
        
        Boolean flag = true;//Loop runs till set to false
        while (flag)
        {
            if ("1".equals(userInput)){
                help.instructions();
                flag = false;
            }
            else if ("2".equals(userInput)){
                //2 is exit, doing nothing exits
                flag = false;
            }
            else{
                System.out.println("Please enter a valid option\n\n");
                help.showOptions();
                userInput = help.getOption();
            }
        }
    }
}