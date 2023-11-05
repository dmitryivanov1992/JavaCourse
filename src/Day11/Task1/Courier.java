package Day11.Task1;

public class Courier extends Workman implements Worker {
    public Courier(int salary, boolean isPayed, Warehouse warehouse) {
        super(salary, isPayed, warehouse);
    }

    @Override
    public String toString() {
        return "Зарплата курьера составляет " + super.getSalary() + ". Бонус " + (super.getPayed() ? "выплачен" : "не выплачен") + ".";
    }

    @Override
    public void doWork() {
        this.salary += 100;
        this.warehouse.countDeliveredOrders++;
    }

    @Override
    public void bonus() {
        if (!this.isPayed && this.warehouse.countDeliveredOrders >= 10000) {
            salary += 50000;
            this.isPayed = true;
        } else if (this.warehouse.countDeliveredOrders < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
