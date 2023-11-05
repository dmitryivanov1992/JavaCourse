package Day11.Task1;

public abstract class Workman {
    protected int salary;
    protected boolean isPayed;
    protected Warehouse warehouse;

    public Workman(int salary, boolean isPayed, Warehouse warehouse){
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }
    public int getSalary() {
        return salary;
    }

    public boolean getPayed() {
        return isPayed;
    }
}
