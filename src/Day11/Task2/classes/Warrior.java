package Day11.Task2.classes;

public class Warrior extends Hero {
    public Warrior() {
        this.physAtt = 30;
        this.physDef = 80;
    }
    @Override
    public String toString(){
        return "Warrior{health="+this.health+"}";
    }
}
