package Decorator;

public class Main {
    public static void main(String[] args) {
         Ingredient iceCream = new ChocoChips(
            new MangoScoop(
                new ChocoCone()
            )
        );


        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}
