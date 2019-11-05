/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuncoPlus;

import DiceFramework.*;
import java.util.ArrayList;

/**
 *
 * @author Romy Steve
 */
public class StrategieJeuBancoPlus implements IStrategieJeu {

    @Override
    public void calculerScoreTour(Jeu jeu) {
        Boolean passerLaMain = false;
        int score = 0;
        if (jeu == null) {
            throw new IllegalStateException("Le jeu n'a pas encore commencé");
        }
        Iterator listeJoueurIterator = jeu.getListJoueur().creerIterateur();

        while (listeJoueurIterator.hasnext()) {
            Joueur joueur = (Joueur) listeJoueurIterator.next();
            do {
                Iterator listeDeIterator = joueur.roulerLesDes().creerIterateur();
                Util util = this.nbFaceDesEgaux(listeDeIterator);
                if (util.getNbFaceEgaux() == 1 && util.getNoFace() == jeu.getnbTours()) {
                    score += 1;
                    passerLaMain = false;
                } else if (util.getNbFaceEgaux() == 2 && util.getNoFace() == jeu.getnbTours()) {
                    score += 2;
                    passerLaMain = false;
                } else if (util.getNbFaceEgaux() == 3 && util.getNoFace() == jeu.getnbTours()) {
                    System.out.println("BUNCO!!!!");
                    score += 21;
                    passerLaMain = false;
                } else {
                    score += 0;
                    passerLaMain = true;
                }

                joueur.setPointJoueur(score);
            } while (!passerLaMain);
        }

    }

    private Util nbFaceDesEgaux(Iterator listDes) {
        int nbFaceEgaux = 0;
        int noFace = 0;
        
        De unDe = (De)listDes.next();
        
        while (listDes.hasnext()) {
            De de = (De) listDes.next();
            nbFaceEgaux = 1;
            if (unDe.compareTo(de) == 0) {
                nbFaceEgaux++;
                noFace = (int) de.getValeurCourantDe();
            }
        }
        
        return new Util(nbFaceEgaux, noFace);
    }

    @Override
    public Joueur calculerLeVainqueur(Jeu jeu) {
        
        Iterator listeJoueurIterator = jeu.getListJoueur().creerIterateur();
        Joueur vainqueur = (Joueur)listeJoueurIterator.next();
        
        ArrayList arrListJoueur = new ArrayList<Joueur>();
        while (listeJoueurIterator.hasnext()) {
            Joueur joueur = (Joueur) listeJoueurIterator.next();
            if (vainqueur.compareTo(joueur) == 1) {
                vainqueur = joueur;
            }
        }

        return vainqueur;
    }

    private class Util{
        
        private int nbFaceEgaux;
        private int noFace;

        public Util(int nbFaceEgaux, int noFace){
            this.nbFaceEgaux = nbFaceEgaux;
            this.noFace = noFace;
        }

        public int getNbFaceEgaux(){
            return this.nbFaceEgaux;
        }
        
        public int getNoFace(){
            return this.noFace;
        }
    }
}

