package Day11.Task2.classes;

import Day11.Task2.interfaces.Healer;
import Day11.Task2.interfaces.PhysAttack;

public class Paladin extends Hero implements Healer, PhysAttack {
    int healHimself = 25;
    int healTeammate = 10;
    public Paladin() {
        this.health = MAX_HEALTH;
        this.physAtt = 15;
        this.physDef = 50;
        this.magicDef = 20;
    }

    @Override
    public void healHimself() {
        if (this.health + healHimself >= MAX_HEALTH) this.health = MAX_HEALTH;
        else this.health+=healHimself;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + healTeammate >= MAX_HEALTH) hero.health = MAX_HEALTH;
        else hero.health += healTeammate;
    }

    @Override
    public void physicalAttack(Hero hero) {
        int damage =  this.physAtt -this.physAtt*hero.physDef/100;
        if (hero.health<=damage) hero.health = MIN_HEALTH;
        else hero.health-=damage;
    }

    @Override
    public String toString(){
        return "Paladin{health="+this.health+"}";
    }
}
