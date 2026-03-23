public class CheeseDecorator extends FoodDecorator {
    public CheeseDecorator(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", Extra Cheese";
    }

    @Override
    public double getCost() {
        return food.getCost() + 1.50;
    }
}
