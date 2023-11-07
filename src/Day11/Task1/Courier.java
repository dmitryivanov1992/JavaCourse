package Day11.Task1;

public class Courier extends Workman implements Worker {
    private final int bonusValue = 50000;
    private final int orderPay = 100;
    private final int bonusOrders = 10000;
    public Courier(int salary, boolean isPayed, Warehouse warehouse) {
        super(salary, isPayed, warehouse);
    }

    @Override
    public String toString() {
        return "Зарплата курьера составляет " + super.getSalary() + ". Бонус " + (super.getPayed() ? "выплачен" : "не выплачен") + ".";
    }

    @Override
    public void doWork() {
        this.salary += orderPay;
        this.warehouse.countDeliveredOrders++;
    }

    @Override
    public void bonus() {
        if (!this.isPayed && this.warehouse.countDeliveredOrders >= bonusOrders) {
            salary += bonusValue;
            this.isPayed = true;
        } else if (this.warehouse.countDeliveredOrders < bonusOrders) {
            System.out.println("Бонус пока не доступен");
        } else if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
