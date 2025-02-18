package Decorator;

public class ChocoChips extends IngredientDecorator {

    public ChocoChips(Ingredient baseIngredient) {
        super(baseIngredient);
    }

    @Override
    public double getCost() {
        return baseIngredient.getCost() + 250;
    }

    @Override
    public String getDescription() {
        return baseIngredient.getDescription() + "with Choco Chips";
    }
}
