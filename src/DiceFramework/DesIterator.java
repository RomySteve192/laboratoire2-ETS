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
public class DesIterator implements Iterator {

    public De[] getDes() {
		return des;
	}

	public void setDes(De[] des) {
		this.des = des;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	De[] des;
    int position = 0;

    /**
     *
     * @param listdes
     */
    public DesIterator(De[] listdes) {
        this.des = listdes;
    }

    /**
     *
     * @return
     */
    @Override
    public Boolean hasnext() {
        if (this.position >= this.des.length || this.des[this.position] == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     *
     * @return
     */
    @Override
    public Object next() {
        De d = this.des[this.position];
        this.position = this.position + 1;
        return d;
    }

}
