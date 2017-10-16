/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrownAndAnchor;



import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author Corey Schmetzer
 */
public class Bug1Replication {
    
    public Bug1Replication() {
    }
    
    /**
     * Test of playRound method, of class Game.
     */
    @Test
    public void testBug1() {
        System.out.println("Bug 1 Test");
        int balance = 100;
        int expBalance = 100;
        int bet = 5;
        //Create a player and set his bet and pick
        Player player = new Player("Fred", balance);
        System.out.printf("%s's balance is %d\n\n",
                    player.getName(), player.getBalance());
        DiceValue pick = DiceValue.CROWN;

        //Initialise mock of dice with predetermined result
        Dice d1 = mock(Dice.class);
        when(d1.getValue()).thenReturn(DiceValue.HEART);

        Dice d2 = mock(Dice.class);
        when(d2.getValue()).thenReturn(DiceValue.CROWN);

        Dice d3 = mock(Dice.class);
        when(d3.getValue()).thenReturn(DiceValue.ANCHOR);

        ArrayList<Dice> dice = new ArrayList<Dice>();
        dice.add(d1);
        dice.add(d2);
        dice.add(d3);
        
        //Determine the amount of matches, and whether or not the game was won
        int matches = 0;
        Boolean win = false;
        for (Dice d : dice) {
            d.roll();
            if (d.getValue().equals(pick)) {
                matches += 1;
                win = true;
            }
        }
        //If player loses decrease balance instead (Not tested with current test data)
        if (!win) {
            expBalance -= bet;
        }
        expBalance += bet * matches;

        Game instance = new Game(d1, d2, d3);

        System.out.printf("%s bet %d on %s\n",
                player.getName(), bet, pick);

        System.out.printf("Rolled %s, %s, %s\n",
                d1.getValue(), d2.getValue(), d3.getValue());

        int winnings = instance.playRound(player, pick, bet);

        if (winnings > 0) {
            System.out.printf("%s won %d, balance now %d\n\n",
                    player.getName(), winnings, player.getBalance());
        } else {
            System.out.printf("%s lost, balance now %d\n\n",
                    player.getName(), player.getBalance());
        }

        assertEquals(bet * matches, winnings);
        assertEquals(expBalance, player.getBalance());
    }
    
}
