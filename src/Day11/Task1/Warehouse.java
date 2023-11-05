package Day11.Task1;

public class Warehouse {
    protected int countPickedOrders;
    protected int countDeliveredOrders;

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    @Override
    public String toString() {
        return "Количество собранных заказов: " + countPickedOrders +
                "\nКоличество доставленных заказов: " + countDeliveredOrders;
    }
}
