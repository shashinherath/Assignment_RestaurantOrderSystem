// package RestaurantOrderSystem;

public class PizzaFactory extends FoodFactory {
    @Override
    public Food createFood() {
        return new Pizza();
    }
}
