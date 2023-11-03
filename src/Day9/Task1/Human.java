package Day9.Task1;

public class Human {
    protected final String name;

    public Human(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void printInfo(){
        System.out.println("Этот человек с именем "+name);
    }
}
