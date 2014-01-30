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
public class PlayerStats {
    int playerWins = 0;
    int computerWins = 0;
    
    public void addWin(int whoWon){
        if (whoWon == 1){
            this.playerWins++;
        }
        else{
            this.computerWins++;
        }
    }
    
    public double statistics(){
        int totalGames = this.playerWins + this.computerWins;
        if (totalGames == 0){
            return 0;
        }
        double playerWinPercent = this.playerWins / totalGames;
        return playerWinPercent;
    }
    
    public void showStatistics(double playerWinPercent){
        System.out.print("the players stats are: \"");
        System.out.print(playerWinPercent);
        System.out.print(" %\"\n");        
    }
}