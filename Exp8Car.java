class Exp8Car {
    // Inner class
    class Engine {
        // Method to start the engine
        public void start() {
            System.out.println("Engine started");
        }

        // Method to stop the engine
        public void stop() {
            System.out.println("Engine stopped");
        }
    }

    // Method to drive the car
    public void drive() {
        Engine engine = new Engine();
        engine.start();
        System.out.println("Car is driving...");
        engine.stop();
    }

    // Main method
    public static void main(String[] args) {
        Exp8Car car = new Exp8Car();
        car.drive();
    }
}
