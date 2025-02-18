package Observer;

public class InventoryPOEhandler implements EventHandler {

    public InventoryPOEhandler(){
        Publisher.getInstance().register(this);
    }
    @Override
    public void handle() {
        System.out.println("Handling inventory");
    }
}
