package food.icecream;

public class Chocolate implements IceCream {

    @Override
    public void flavour() {
        System.out.println("The ice cream is chocolate flavoured.");
    }

    @Override
    public void color() {
        System.out.println("The color of the ice cream is brown.");
    }
}
