public interface MealBuilderInterface {

    void buildBurguer();
    void buildDrink();
    Meal getMeal();

}

class VegMealBuilder implements MealBuilderInterface {
    private Meal vegMeal = new Meal();

    @Override
    public void buildBurguer() {
        vegMeal.addItem(new VegBurguer());
    }

    @Override
    public void buildDrink() {
        vegMeal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}

class NonVegMealBuilder implements MealBuilderInterface {
    private Meal nonVegMeal = new Meal();

    @Override
    public void buildBurguer() {
        nonVegMeal.addItem(new ChickenBurguer());
    }

    @Override
    public void buildDrink() {
        nonVegMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return nonVegMeal;
    }
}
