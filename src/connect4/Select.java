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
    int difficulty = 2;
    int players = 2;     
    private String name;
    
    public void difficulty() {
        System.out.println(this.name + ", how difficult do you want"
                + "your opponent to be? Choose 1-5");
        Scanner input = new Scanner(System.in);
        this.difficulty = input.next();
}
}
