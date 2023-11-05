package Day11.Task1;

public class Picker extends Workman implements Worker {
    public Picker(int salary, boolean isPayed, Warehouse warehouse) {
        super(salary, isPayed, warehouse);
    }

    @Override
    public String toString() {
        return "Зарплата сборщика составляет " + super.getSalary() + ". Бонус " + (super.getPayed() ? "выплачен" : "не выплачен" + ".");
    }

    @Override
    public void doWork() {
        this.salary += 80;
        this.warehouse.countPickedOrders++;
    }

    @Override
    public void bonus() {
        if (!this.isPayed && this.warehouse.countPickedOrders >= 10000) {
            salary += 70000;
            this.isPayed = true;
        } else if (this.warehouse.countPickedOrders < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
