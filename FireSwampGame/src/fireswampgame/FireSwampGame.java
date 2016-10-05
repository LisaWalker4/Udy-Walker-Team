/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireswampgame;

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
        
        Player playerOne = new Player();
        
        playerOne.setName("John Doe");
        playerOne.setCoordinates(2.5);
        
        String playerInfo = playerOne.toString(); 
        System.out.println(playerInfo);
        
    }
    
}
