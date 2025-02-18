package Observer;

public class BillingPOEhandler implements EventHandler{

    public BillingPOEhandler(){
        Publisher.getInstance().register(this);
    }

    @Override
    public void handle() {
        System.out.println("Creating Bill");
    }
}
