public class VehicleManagementMain {

    public static void main(String[] args) {

        // Create a Car object
        Car car = new Car();

        System.out.println("Car Details");

        car.start();
        car.stop();
        car.calculateMileage();


        System.out.println();


        // Create a Bike object
        Bike bike = new Bike();

        System.out.println("Bike Details");

        bike.start();
        bike.stop();
        bike.calculateMileage();
    }
}