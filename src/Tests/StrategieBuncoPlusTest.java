package Tests;

import BuncoPlus.StrategieJeuBancoPlus;
import DiceFramework.Jeu;

public class StrategieBuncoPlusTest {

	
	public void calculerScoreTourTest() {

		StrategieJeuBancoPlus sjbp = new  StrategieJeuBancoPlus();
		Jeu j = new Jeu();
		sjbp.calculerScoreTour();
	}
}
