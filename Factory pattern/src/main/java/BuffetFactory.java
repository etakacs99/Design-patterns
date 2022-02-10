import drink.*;
import food.fastfood.*;
import food.icecream.*;

public class BuffetFactory {
    public static Drink getDrink(String drinkType){
        if(drinkType == null){
            return null;
        }
        if(drinkType.equalsIgnoreCase("BEER")){
            return new Beer();
        }
        if(drinkType.equalsIgnoreCase("WATER")){
            return new Water();
        }
        if(drinkType.equalsIgnoreCase("ICE TEA")){
            return new IceTea();
        }
        return null;
    }

    public static FastFood getFood(String foodType){
        if(foodType == null){
            return null;
        }
        if(foodType.equalsIgnoreCase("FRENCH FRIES")){
            return new FrenchFries();
        }
        if(foodType.equalsIgnoreCase("HAMBURGER")){
            return new Hamburger();
        }
        if(foodType.equalsIgnoreCase("HOT DOG")){
            return new HotDog();
        }
        return null;
    }

    public static IceCream getIceCream(String iceCreamType){
        if(iceCreamType.equalsIgnoreCase("CHOCOLATE")){
            return new Chocolate();
        }
        if(iceCreamType.equalsIgnoreCase("LEMON")){
            return new Lemon();
        }
        if(iceCreamType.equalsIgnoreCase("STRAWBERRY")){
            return new Strawberry();
        }
        return null;
    }
}
