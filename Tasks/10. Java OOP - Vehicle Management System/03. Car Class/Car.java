// Car inherits Vehicle and implements FuelEfficiency
public class Car extends Vehicle implements FuelEfficiency {

    // Car start method
    @Override
    public void start() {

        System.out.println("The car has started.");
    }

    // Car stop method
    @Override
    public void stop() {

        System.out.println("The car has stopped.");
    }

    // Car mileage calculation
    @Override
    public void calculateMileage() {

        double distance = 300;
        double fuelUsed = 20;

        double mileage = distance / fuelUsed;

        System.out.println(
            "Car mileage: " + mileage + " km per litre"
        );
    }
}