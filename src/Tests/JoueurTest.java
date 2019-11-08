package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import DiceFramework.CollectionDe;
import DiceFramework.De;
import DiceFramework.Joueur;
import junit.framework.TestCase;

class JoueurTest {
	
	
	
	
	
	
	@Test
	public void TestcompareTo() {
		Joueur j1;
		Joueur j2;
		
		CollectionDe tabDe  =  new CollectionDe();
		
	          tabDe.ajouter(new De(6));
	          tabDe.ajouter(new De(7));
	    
		
		
		j1 = new Joueur(tabDe);
		j2 = new Joueur(tabDe);
		
		
		assertEquals(j1.compareTo(j2), 0);
		
	
	}
	
	
	
	


}