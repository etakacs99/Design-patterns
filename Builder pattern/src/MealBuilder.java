public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new SaltyFries());
        meal.addItem(new VeggieBurger());
        meal.addItem(new IceTea());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new SaltyFries());
        meal.addItem(new ChickenBurger());
        meal.addItem(new CocaCola());
        return meal;
    }

    public Meal extraMeatMeal(){
        Meal meal = new Meal();
        meal.addItem(new BaconFries());
        meal.addItem(new BeefBurger());
        meal.addItem(new CocaCola());
        return meal;
    }
}
