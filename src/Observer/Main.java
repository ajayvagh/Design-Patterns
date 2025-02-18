package Observer;

public class Main {
    public static void main(String[] args) {

        new InventoryPOEhandler();
        Publisher.getInstance().placeOrder();
        System.out.println("--------------");
        new BillingPOEhandler();
        Publisher.getInstance().placeOrder();
    }
}
