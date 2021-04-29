package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit{

    private int strength = 150;
    private int loss = 20;
    private boolean hasPancel =true;


    public HeavyCavalry(int strength, int loss, boolean hasPancel) {
        super(150, 20, true);
    }

    @Override
    public int doDamage() {
        return loss-=20;
    }

    @Override
    public int sufferDanage(int damage) {
        return  strength-=damage/2;
    }
}
