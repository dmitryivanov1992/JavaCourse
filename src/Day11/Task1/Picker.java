package Day11.Task1;

public class Picker extends Workman implements Worker {

    private final int bonusValue = 70000;
    private final int orderPay = 80;
    private final int bonusOrders = 10000;
    public Picker(int salary, boolean isPayed, Warehouse warehouse) {
        super(salary, isPayed, warehouse);
    }

    @Override
    public String toString() {
        return "Зарплата сборщика составляет " + super.getSalary() + ". Бонус " + (super.getPayed() ? "выплачен" : "не выплачен" + ".");
    }

    @Override
    public void doWork() {
        this.salary += orderPay;
        this.warehouse.countPickedOrders++;
    }

    @Override
    public void bonus() {
        if (!this.isPayed && this.warehouse.countPickedOrders >= bonusOrders) {
            salary += bonusValue;
            this.isPayed = true;
        } else if (this.warehouse.countPickedOrders < bonusOrders) {
            System.out.println("Бонус пока не доступен");
        } else if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
