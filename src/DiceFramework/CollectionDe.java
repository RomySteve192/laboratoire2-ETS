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
public class CollectionDe implements CollectionsJeu {

    private De[] tabDe;
    private int indFin = 0;
    private int tailleIniTabDe;

    /**
     *
     */
    public CollectionDe() {

        this.tailleIniTabDe = 10;
        this.tabDe = new De[this.tailleIniTabDe];
    }

    /**
     *
     * @param d
     */
    public void ajouter(De d) {
        this.tabDe[this.indFin] = d;
        this.indFin++;

        if (this.indFin == this.tabDe.length - 1) {
            De[] tabDe2 = new De[this.tabDe.length + this.tailleIniTabDe];
            System.arraycopy(this.tabDe, 0, tabDe2, 0, this.tabDe.length);
            this.tabDe = tabDe2;
        }
    }

    /**
     *
     * @return
     */
    @Override
    public Iterator creerIterateur() {
        return new DesIterator(this.tabDe);
    }
}
