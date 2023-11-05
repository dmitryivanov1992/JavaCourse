package Day11.Task2.classes;

import Day11.Task2.interfaces.PhysAttack;

public class Warrior extends Hero implements PhysAttack {
    public Warrior() {
        this.health = MAX_HEALTH;
        this.physAtt = 30;
        this.physDef = 80;
    }

    @Override
    public void physicalAttack(Hero hero) {
        int damage =  this.physAtt -this.physAtt*hero.physDef/100;
        if (hero.health<=damage) hero.health = MIN_HEALTH;
        else hero.health-=damage;
    }

    @Override
    public String toString(){
        return "Warrior{health="+this.health+"}";
    }
}
