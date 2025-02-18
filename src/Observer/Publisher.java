package Observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List < EventHandler > eventHandlerList;

    private Publisher(){
        eventHandlerList = new ArrayList< EventHandler >();
    }

    private static Publisher Instance = null;

    public static Publisher getInstance(){
        if(Instance == null){
            Instance = new Publisher();
        }
        return Instance;
    }

    public void register(EventHandler eh){
        eventHandlerList.add(eh);
    }

    public void deregister(EventHandler eh){
        eventHandlerList.remove(eh);
    }

    public void placeOrder(){
        for(EventHandler eh : eventHandlerList){
            eh.handle();
        }
    }
}
