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
    private CollectionJoueur tabJoueur = new CollectionJoueur();
    private Joueur j ;


    /**
     * Constructeur de la classe qui va
     * initialiser les parametres qui vont permettre de
     * tester les methodes de la classe CollectionJoeur
     */


        private  CollectionDe tabDe = new CollectionDe();




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

    for (int i= 0 ; i < 20 ; i++){
        this.tabDe.ajouter(new De(6));
       this. tabDe.ajouter(new De(7));
    }
    this.j = new Joueur(this.tabDe);
    
    


        for (int i= 0 ; i < 7 ; i++){
            tabJoueur.ajouter(j);

        }

        assertTrue(tabJoueur.getTabJoueur().length>10);
    }
}
