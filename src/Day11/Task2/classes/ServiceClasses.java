package Day11.Task2.classes;

import static Day11.Task2.classes.Hero.MIN_HEALTH;
import static Day11.Task2.classes.Hero.MAX_HEALTH;

public class ServiceClasses {
    public void pAttack(Hero attacker, Hero defending){
        int damage =  attacker.physAtt -attacker.physAtt*defending.physDef/100;
        if (defending.health<=damage) defending.health = MIN_HEALTH;
        else defending.health-=damage;
    }
    public void mAttack(Hero attacker, Hero defending){
        int damage = attacker.magicAtt - attacker.magicAtt * defending.magicDef / 100;
        if (defending.health <= damage) defending.health = MIN_HEALTH;
        else defending.health -= damage;
    }

    public void healHimself(Hero healer, int healHimself){
        if (healer.health + healHimself >= MAX_HEALTH) healer.health = MAX_HEALTH;
        else healer.health+=healHimself;
    }

    public void healTeammate(Hero hero, int healTeammate) {
        if (hero.health + healTeammate >= MAX_HEALTH) hero.health = MAX_HEALTH;
        else hero.health += healTeammate;
    }


    
}
