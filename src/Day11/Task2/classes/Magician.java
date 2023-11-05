package Day11.Task2.classes;

import Day11.Task2.interfaces.MagicAttack;
import Day11.Task2.interfaces.PhysAttack;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    public Magician(){
        this.health = MAX_HEALTH;
        this.physAtt = 5;
        this.magicAtt = 20;
        this.magicDef = 80;
    }

    @Override
    public void magicalAttack(Hero hero) {
        int damage =  this.magicAtt -this.magicAtt*hero.magicDef/100;
        if (hero.health<=damage) hero.health = MIN_HEALTH;
        else hero.health-=damage;
    }

    @Override
    public void physicalAttack(Hero hero) {
        int damage =  this.physAtt -this.physAtt*hero.physDef/100;
        if (hero.health<=damage) hero.health = MIN_HEALTH;
        else hero.health-=damage;
    }

    @Override
    public String toString(){
        return "Magician{health="+this.health+"}";
    }
}
