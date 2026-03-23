// package RestaurantOrderSystem;

public class Burger implements Food {
    @Override
    public String getDescription() {
        return "Classic Burger";
    }

    @Override
    public double getCost() {
        return 5.99;
    }
}
