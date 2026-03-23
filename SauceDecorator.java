public class SauceDecorator extends FoodDecorator {
    public SauceDecorator(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", Special Sauce";
    }

    @Override
    public double getCost() {
        return food.getCost() + 0.75;
    }
}
