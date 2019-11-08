package Tests;
import DiceFramework.CollectionDe;
import DiceFramework.CollectionJoueur;
import DiceFramework.De;
import DiceFramework.Joueur;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * @author anhe Pascal
 * @version 1.0
 */


public class CollectionJoueurTest  {
    

    /**
     * Cette methode  va tester
     * la methode calculer de la classe
     * CollectionJoeur
     * on va tester le nombre d'element et aussi
     *
     * @throws Exception
     */

@Test
    public void TestCalculer(){
	
	CollectionJoueur tabJoueur = new CollectionJoueur();
	CollectionDe tabDe = new CollectionDe();

    for(int i= 0 ; i < 20 ; i++)
    {
        tabDe.ajouter(new De(6));
       tabDe.ajouter(new De(7));
    }

    
    Joueur j = new Joueur(tabDe);
    
    


        for (int i= 0 ; i < 7 ; i++){
            tabJoueur.ajouter(j);}

        assertTrue(tabJoueur.getTabJoueur().length>10);
    }
}
