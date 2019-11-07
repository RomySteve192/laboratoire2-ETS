/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiceFramework;

import java.util.Random;

/**
 *
 * @author Romy Steve
 */
public class De implements Comparable<De> {

    private int nbreFace;
    private int valeurCourant;

    private final static Random rdm = new Random();

    /**
     *
     * @param nbFace
     */
    public De(int nbFace) {
        if (nbFace < 1) {
            throw new IllegalArgumentException("Le nombre de face doit être superieur à 1");
        }
        this.nbreFace = nbFace;
        this.valeurCourant = 0;
    }

    /**
     *
     */
    public void roulerDe() {
        this.valeurCourant = rdm.nextInt(this.nbreFace) + 1;
    }

    /**
     *
     * @return
     */
    public Integer getValeurCourantDe() {
        if (this.valeurCourant == 0) {
            throw new IllegalStateException("Le dé n'a pas été lancé.");
        }

        return this.valeurCourant;
    }

    /**
     *
     * @return
     */
    public Integer getNbreDeFaces() {
        return this.nbreFace;
    }

    /**
     * Sert à faire la compararaison d'un dé avec un autre
     *
     * @param d Dé à comparer
     * @return -1 si de faces 1 si
     */
    @Override
    public int compareTo(De d) {
        if (d == null) {
            throw new IllegalArgumentException("Le dé d est null");
        }

        return this.getValeurCourantDe().compareTo(d.getValeurCourantDe());
    }

	public int getNbreFace() {
		return nbreFace;
	}

	public void setNbreFace(int nbreFace) {
		this.nbreFace = nbreFace;
	}

	public int getValeurCourant() {
		return valeurCourant;
	}

	public void setValeurCourant(int valeurCourant) {
		this.valeurCourant = valeurCourant;
	}

	public static Random getRdm() {
		return rdm;
	}

}
