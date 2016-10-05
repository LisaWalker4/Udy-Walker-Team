/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireswampgame;

import byui.cit260.fireSwampGame.model.Game;
import byui.cit260.fireSwampGame.model.Player;

/**
 *
 * @author Gina Udy
 */
public class FireSwampGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Game gameOne = new Game(); 
        
        gameOne.setTotalTime(3.0);
        gameOne.setGetItem("testing");
        gameOne.setGetMap(2.0);
        gameOne.setSaveGame(0);
        gameOne.setLoadGame(0);
        
    }
    
}
