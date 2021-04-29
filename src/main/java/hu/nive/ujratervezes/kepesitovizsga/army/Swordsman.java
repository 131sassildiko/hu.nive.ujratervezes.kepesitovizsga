package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit{

    private int strength = 100;
    private int loss = 10;
    private boolean hasPancel;

    public Swordsman(int strength, int loss, boolean hasPancel) {
        super(100, 10, hasPancel);
    }

    @Override
    public int doDamage() {
        return loss-=10;
    }

    @Override
    public int sufferDanage(int damage) {
        return  strength-=damage;
    }
}
