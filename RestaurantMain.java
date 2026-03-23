import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Restaurant Order System ---");

        Food myOrder = null;

        while (myOrder == null) {
            System.out.print("Choose Base Food (1 for Burger, 2 for Pizza): ");
            String baseChoice = scanner.nextLine();
            if ("1".equals(baseChoice) || baseChoice.equalsIgnoreCase("Burger")) {
                FoodFactory burgerFactory = new BurgerFactory();
                myOrder = burgerFactory.createFood();
            } else if ("2".equals(baseChoice) || baseChoice.equalsIgnoreCase("Pizza")) {
                FoodFactory pizzaFactory = new PizzaFactory();
                myOrder = pizzaFactory.createFood();
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Base Order: " + myOrder.getDescription() + " | Cost: $" + myOrder.getCost());

        boolean ordering = true;
        while (ordering) {
            System.out.print("Add Topping (1 for Cheese, 2 for Sauce, 0 to Finish): ");
            String toppingChoice = scanner.nextLine();

            if ("1".equals(toppingChoice) || toppingChoice.equalsIgnoreCase("Cheese")) {
                myOrder = new CheeseDecorator(myOrder);
                System.out.println("Added Cheese -> " + myOrder.getDescription() + " | Cost: $"
                        + String.format("%.2f", myOrder.getCost()));
            } else if ("2".equals(toppingChoice) || toppingChoice.equalsIgnoreCase("Sauce")) {
                myOrder = new SauceDecorator(myOrder);
                System.out.println("Added Sauce -> " + myOrder.getDescription() + " | Cost: $"
                        + String.format("%.2f", myOrder.getCost()));
            } else if ("0".equals(toppingChoice) || toppingChoice.equalsIgnoreCase("Finish")) {
                ordering = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("\n--- Final Order Summary ---");
        System.out.println("Description: " + myOrder.getDescription());
        System.out.println("Total Cost: $" + String.format("%.2f", myOrder.getCost()));
        System.out.println("---------------------------");

        scanner.close();
    }
}
