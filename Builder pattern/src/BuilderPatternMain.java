import java.util.Scanner;

public class BuilderPatternMain {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Scanner scanner = new Scanner(System.in);

        printMenu();
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Meal vegMeal = mealBuilder.prepareVegMeal();
                System.out.println("The vegetarian meal is: ");
                vegMeal.showItems();
                System.out.println("The total cost is:" + vegMeal.getCost());
                break;
            case 2:
                Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
                System.out.println("The non vegetarian meal is: ");
                nonVegMeal.showItems();
                System.out.println("The total cost is: " + nonVegMeal.getCost());
                break;
            case 3:
                Meal extraMeatMeal = mealBuilder.extraMeatMeal();
                System.out.println("The extra meet meal is: ");
                extraMeatMeal.showItems();
                System.out.println("The total cost is: " + extraMeatMeal.getCost());
                break;
            default:
                System.out.println("This meal doesn't exist.");
        }
    }

    public static void printMenu(){
        System.out.println("The menu: ");
        System.out.println("1) Veggie meal");
        System.out.println("2) Non veggie chicken meal");
        System.out.println("3) Extra meat (beef) meal");
    }
}
