package food.icecream;

public class Lemon implements IceCream {
    @Override
    public void flavour() {
        System.out.println("The ice cream is lemon flavoured.");
    }

    @Override
    public void color() {
        System.out.println("The color of the ice cream is white.");
    }
}
