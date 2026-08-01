// Bike inherits Vehicle and implements FuelEfficiency
public class Bike extends Vehicle implements FuelEfficiency {

    // Bike start method
    @Override
    public void start() {

        System.out.println("The bike has started.");
    }

    // Bike stop method
    @Override
    public void stop() {

        System.out.println("The bike has stopped.");
    }

    // Bike mileage calculation
    @Override
    public void calculateMileage() {

        double distance = 180;
        double fuelUsed = 6;

        double mileage = distance / fuelUsed;

        System.out.println(
            "Bike mileage: " + mileage + " km per litre"
        );
    }
}