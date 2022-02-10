package food.icecream;

public class Strawberry implements IceCream {
    @Override
    public void flavour() {
        System.out.println("The ice cream is strawberry flavoured.");
    }

    @Override
    public void color() {
        System.out.println("The color of the ice cream is pink.");
    }
}
