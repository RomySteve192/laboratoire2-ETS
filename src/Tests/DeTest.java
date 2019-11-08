package Tests;

import DiceFramework.De;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class DeTest  {

	
    @Test
    public void TestroulerDe () throws Exception{
    	
    	int nbFace = 6;
    	De monDe = new De(nbFace);
        monDe.roulerDe();
        assertTrue(monDe.getValeurCourantDe() >0 && monDe.getValeurCourantDe() < 7);
    }

    
@Test
    public void TestgetNbreDeFaces() throws Exception {
    	int nbFace = 6;
    	De monDe = new De(nbFace);
        assertTrue(monDe.getNbreDeFaces()> 0 && monDe.getNbreDeFaces()<7);
    }
}
