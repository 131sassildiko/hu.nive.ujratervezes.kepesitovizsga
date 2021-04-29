package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    private int strength;
    private int loss;
    private boolean hasPancel;

    public MilitaryUnit(int strength, int loss, boolean hasPancel) {
        this.strength = strength;
        this.loss = loss;
        this.hasPancel = hasPancel;
    }

    public int getStrength() {
        return strength;
    }

    public int getLoss() {
        return loss;
    }

    public boolean hasPancel() {
        return hasPancel;
    }

    public  abstract int doDamage ();
    public  abstract int sufferDanage (int damage) ;
}
