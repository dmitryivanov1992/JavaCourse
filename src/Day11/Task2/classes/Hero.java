package Day11.Task2.classes;

import Day11.Task2.interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {
    protected int health = MAX_HEALTH;
    protected int physDef;
    protected int magicDef;
    protected  int physAtt;
    static int MAX_HEALTH = 100;
    static int MIN_HEALTH = 0;

    @Override
    public void physicalAttack(Hero hero) {
        int damage =  this.physAtt -this.physAtt*hero.physDef/100;
        if (hero.health<=damage) hero.health = MIN_HEALTH;
        else hero.health-=damage;
    }
}
