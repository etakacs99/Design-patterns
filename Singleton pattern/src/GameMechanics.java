public class GameMechanics {
    //Create an object of GameMechanics.
    private static final GameMechanics instance = new GameMechanics();

    private int hp;
    private int coins;

    //Make the constructor private so that this class cannot be instantiated.
    private GameMechanics(){
        hp = 100;
        coins = 500;
    }

    //Get the only object available.
    public static GameMechanics getInstance(){
        return instance;
    }

    public void PlayerDamaged(int amount) {
        hp -= amount;
    }

    public void CoinPickedUp(){
        coins += 10;
    }

    public int getHp(){
        return hp;
    }

    public void showHpAndGold(){
        System.out.println("You have " + hp + " health and " + coins + " golds.");
    }
}
