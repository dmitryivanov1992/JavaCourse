package Day7;

public class Player {
    private int stamina;
    public final int MAX_STAMINA = 100;
    public final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        if (stamina < MAX_STAMINA && stamina > MIN_STAMINA) this.stamina = stamina;
        if (countPlayers < 6) countPlayers++;
    }

    public int getStamina() {
        return this.stamina;
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (this.stamina > MIN_STAMINA) {
            this.stamina -= 1;
            if (this.stamina == 0) {
                countPlayers -= 1;
                System.out.println("Игрок устал и покидает поле");
            }
        }

    }

    public static void info() {
        if (countPlayers < 6)
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        else if (countPlayers == 6) System.out.println("На поле нет свободных мест");
    }
}
