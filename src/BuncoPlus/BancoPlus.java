/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuncoPlus;

import DiceFramework.*;

/**
 *
 * @author Romy Steve
 */
public class BancoPlus extends FabriqueJeuDe {

    private StrategieJeuBancoPlus strategieJeu;

    /**
     *
     * @param strategieJeu
     */
    public BancoPlus(StrategieJeuBancoPlus strategieJeu) {
        this.strategieJeu = strategieJeu;
    }

    @Override
    protected CollectionDe creerDes() {
        CollectionDe des = new CollectionDe();
        des.ajouter(new De(6));
        des.ajouter(new De(6));
        des.ajouter(new De(6));
        return des;
    }

    @Override
    protected CollectionJoueur creerListJoueur(int nbJ) {
        CollectionJoueur joueurs = new CollectionJoueur();
        joueurs.ajouter(new Joueur(this.creerDes()));
        joueurs.ajouter(new Joueur(this.creerDes()));
        return joueurs;
    }

    /**
     *
     * @param nbJ
     */
    public void Play(int nbJ) {
        this.creerUnJeu(6, nbJ, this.strategieJeu);
    }

}
