interface EventHandler {
    void handleEvent();
}

public class Exp8EventHandler {
    
    public void registerEvent() {
        // Local Inner Class
        class LocalEventHandler implements EventHandler {
            @Override
            public void handleEvent() {
                System.out.println("Event handled by local inner class");
            }
        }
        
        EventHandler localHandler = new LocalEventHandler();
        localHandler.handleEvent();
    }
    
    public static void main(String[] args) {
        Exp8EventHandler demo = new Exp8EventHandler();
        
        // Demonstrating local inner class
        demo.registerEvent();
        
        // Anonymous Inner Class Implementation
        EventHandler anonymousHandler = new EventHandler() {
            @Override
            public void handleEvent() {
                System.out.println("Event handled by anonymous inner class");
            }
        };
        
        anonymousHandler.handleEvent();
    }
}