package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit{

    private int strength = 50;
    private int loss = 20;
    private boolean hasPancel =false;

    public Archer(int strength, int loss, boolean hasPancel) {
        super(50, 20, false);
    }

    @Override
    public int doDamage() {
        return loss-=50;
    }

    @Override
    public int sufferDanage(int damage) {
        return strength-=damage;
    }


}