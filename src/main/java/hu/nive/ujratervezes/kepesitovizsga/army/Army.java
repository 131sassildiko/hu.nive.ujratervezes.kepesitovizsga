package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> militaryUnitList = new ArrayList<>();

    public List<MilitaryUnit> getMilitaryUnitList() {
        return militaryUnitList;
    }

    public void addUnit (MilitaryUnit militaryUnit) { militaryUnitList.add(militaryUnit);
    };

    public void damageAll(int damage) {
        for MilitaryUnit militaryUnit : militaryUnitList{
            militaryUnit.doDamage();
        }
    }

}
