package Day11.Task2.classes;

import Day11.Task2.interfaces.Healer;
import Day11.Task2.interfaces.MagicAttack;

public class Shaman extends Hero implements MagicAttack, Healer {
    private final int magicAtt;
    private final int healHimself = 50;
    private final int healTeammate = 30;

    public Shaman() {
        this.physAtt = 10;
        this.magicAtt = 15;
        this.physDef = 20;
        this.magicDef = 20;
    }

    @Override
    public void healHimself() {
        if (this.health + healHimself >= MAX_HEALTH) this.health = MAX_HEALTH;
        else this.health += healHimself;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + healTeammate >= MAX_HEALTH) hero.health = MAX_HEALTH;
        else hero.health += healTeammate;
    }

    @Override
    public void magicalAttack(Hero hero) {
        int damage = this.magicAtt - this.magicAtt * hero.magicDef / 100;
        if (hero.health <= damage) hero.health = MIN_HEALTH;
        else hero.health -= damage;
    }

    @Override
    public String toString(){
        return "Shaman{health="+this.health+"}";
    }
}
