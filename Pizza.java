// package RestaurantOrderSystem;

public class Pizza implements Food {
    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }

    @Override
    public double getCost() {
        return 8.99;
    }
}
