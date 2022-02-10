import java.util.Random;

public class Main {

    static int nextInt(int upper) {
        return nextInt(0, upper);
    }

    static int nextInt(int lower, int upper) {
        return random.nextInt(upper- lower + 1) + lower;
    }

    static Random random = new Random();

    public static void main(String[] args) {

        //Get the only object available.
        GameMechanics player = GameMechanics.getInstance();

        System.out.println("The GAME begins!\n");
        player.showHpAndGold();

        boolean isOver = false;
        while (!isOver) {
            player.PlayerDamaged(nextInt(1, 10));
            System.out.println("A gnome stabbed you.");
            if (player.getHp() > 0) {
                player.showHpAndGold();
                if (random.nextInt(100) > 40) {
                    System.out.println("You picked up some coin.");
                    player.CoinPickedUp();
                    player.showHpAndGold();
                }
            }
            if (player.getHp() <= 0) {
                isOver = true;
                System.out.println("GAME OVER!");
            }
        }

    }
}
