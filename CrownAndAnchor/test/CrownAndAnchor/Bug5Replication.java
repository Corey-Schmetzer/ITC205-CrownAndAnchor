/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrownAndAnchor;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Corey Schmetzer
 */


public class Bug5Replication {
    
	public Bug5Replication() {
    }
        private Dice d1;
		

	@Test
	public void testRollAllValues() {   
        d1 = new Dice();    
	List<DiceValue> results = new ArrayList<DiceValue>();
		
	int numRolls = 5000;
		
	for (int roll = 0; roll < numRolls; roll++) {
		DiceValue rolled = d1.roll();
		System.out.printf("Roll #%d, rolled %s\n", roll, rolled.toString());
		results.add(rolled);
	}
		
	for (DiceValue value : DiceValue.values()) {
		assertTrue(String.format("Results do not contain: %s", value.toString()), results.contains(value));
	}
	}
	

}
