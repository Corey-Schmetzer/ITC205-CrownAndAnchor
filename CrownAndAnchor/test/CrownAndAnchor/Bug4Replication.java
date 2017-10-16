/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrownAndAnchor;


import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Corey Schmetzer
 */
public class Bug4Replication{
    
    Dice d1; 
    Dice d2;
    Dice d3;
    
    Game game;
    
    @Test
    public void testDiceValueUpdate() {
        d1 = new Dice();
        d2= new Dice();
        d3= new Dice();
        boolean same = false;
        
            d1.roll();
            System.out.printf("Rolled %s, %s, %s\n",
                d1.getValue(), d2.getValue(), d3.getValue());
            System.out.println("---- Next Round-------------------");
            DiceValue result1 = d1.getValue();
            DiceValue result2 = d2.getValue();
            DiceValue result3 = d3.getValue();
            
            //Repeat to have comparable data
            d1.roll();
            System.out.printf("Rolled %s, %s, %s\n",
                d1.getValue(), d2.getValue(), d3.getValue());
            System.out.println("---- Next Round-------------------");
            DiceValue result4 = d1.getValue();
            DiceValue result5 = d2.getValue();
            DiceValue result6 = d3.getValue();
            
            if ((result1.equals(result4)) & (result2.equals(result5)) & (result3.equals(result6))){
            same = true;
    }
            
            assertTrue(same = false);
        }
    }



