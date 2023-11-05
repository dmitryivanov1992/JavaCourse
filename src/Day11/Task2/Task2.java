/*В папке classes мной реализован класс ServiceClasses. Идея была в том, что я создам там повторяющиеся
* во всех классах методы на атаку и лечение и буду их оттуда вызывать. Почему, к примеру, из класса
* Warrior я не могу достучаться до методов в классе ServiceClasses*/

package Day11.Task2;

import Day11.Task2.classes.*;

public class Task2 {
    public static void main(String[] args){
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Shaman shaman = new Shaman();
        Magician magician = new Magician();

        warrior.physicalAttack(paladin);//Воин атакует Паладина
        System.out.println(paladin);
        paladin.physicalAttack(magician);// Паладин атакует Мага
        System.out.println(magician);
        shaman.healTeammate(magician);//Шаман лечит Мага
        System.out.println(magician);
        magician.magicalAttack(paladin);//Маг атакует Паладина, тип атаки М
        System.out.println(paladin);
        shaman.physicalAttack(warrior);//Шаман атакует Воина, тип атаки Ф
        System.out.println(warrior);
        paladin.healHimself();//Паладин лечит себя
        System.out.println(paladin);
        System.out.println();
        for (int i = 0; i < 5; i++) {//Воин атакует Мага 5 раз
            warrior.physicalAttack(magician);
            System.out.println(magician);
        }
    }
}
