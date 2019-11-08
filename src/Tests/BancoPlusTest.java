package Tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import BuncoPlus.BancoPlus;
import BuncoPlus.StrategieJeuBancoPlus;
import DiceFramework.CollectionDe;

public class BancoPlusTest {
	
	StrategieJeuBancoPlus strategieJeu;
	
	
	@Test
	public void TestBancoPlus() {
		BancoPlus bp = new BancoPlus(strategieJeu);
		
		assertTrue(bp != null);
	}
	
/**	@Test
	public void playTest() {
		
		BancoPlus bp = new BancoPlus(strategieJeu);
			
		bp.Play(5);
			assertTrue(bp!= null);
			//assertTrue(bp.creerUnJeu(3, 3, strategieJeu) != null);
	}
**/
}
