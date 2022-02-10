import drink.Drink;
import food.fastfood.FastFood;
import food.icecream.IceCream;

public class Main {
    public static void main(String[] args) {


        System.out.println("Factory pattern output verify:");

        FastFood food1 = BuffetFactory.getFood("HAMBURGER");
        food1.foodType();
        FastFood food2 = BuffetFactory.getFood("FRENCH FRIES");
        food2.foodType();
        FastFood food3 = BuffetFactory.getFood("HOT DOG");
        food3.foodType();

        IceCream food4 = BuffetFactory.getIceCream("CHOCOLATE");
        food4.flavour();
        food4.color();
        IceCream food5 = BuffetFactory.getIceCream("LEMON");
        food5.flavour();
        food5.color();
        IceCream food6 = BuffetFactory.getIceCream("STRAWBERRY");
        food6.flavour();
        food6.color();

        Drink drink1 = BuffetFactory.getDrink("BEER");
        drink1.drinkType();
        Drink drink2 = BuffetFactory.getDrink("WATER");
        drink2.drinkType();
        Drink drink3 = BuffetFactory.getDrink("ICE TEA");
        drink3.drinkType();
    }
}
