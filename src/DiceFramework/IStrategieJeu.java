/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiceFramework;

/**
 *
 * @author Romy Steve
 */
public interface IStrategieJeu {

    /**
     *
     * @param jeu
     */
    public void calculerScoreTour(Jeu jeu);

    /**
     *
     * @param jeu
     * @return
     */
    public Joueur calculerLeVainqueur(Jeu jeu);
}
