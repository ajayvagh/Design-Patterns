package Decorator;

public class ChocoCone implements Ingredient{

    @Override
    public double getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return " with Choco Cone";
    }
}
