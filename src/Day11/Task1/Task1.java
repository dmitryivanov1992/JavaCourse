package Day11.Task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Warehouse warehouse2 = new Warehouse();
        Picker picker1 = new Picker(0, false, warehouse1);
        Courier courier1 = new Courier(0, false, warehouse1);
        Picker picker2 = new Picker(0, false, warehouse2);
        Courier courier2 = new Courier(0, false, warehouse2);
        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println(picker1.toString());
        System.out.println(courier1.toString());
        System.out.println(warehouse1.toString());
        courier2.doWork();
        picker2.doWork();
        System.out.println(picker1.toString());
        System.out.println(courier1.toString());
        System.out.println("На складе 1 - \n" + warehouse1.toString());
        System.out.println("На складе 2 - \n" + warehouse2.toString());
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
