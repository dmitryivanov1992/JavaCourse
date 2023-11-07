package Day11.Task2.classes;

import Day11.Task2.interfaces.MagicAttack;

public class Magician extends Hero implements  MagicAttack {
    private final int magicAtt;
    public Magician(){
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
    public String toString(){
        return "Magician{health="+this.health+"}";
    }
}
