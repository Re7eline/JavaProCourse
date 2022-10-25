package homeWork5;

public class Voyage {
    public static double distance = 476;
    public static double distOdsKryveOzero = 178.5;
    public static double distKozJashkiv = 149.6;

    public static void main(String[] args) {
        double fuelPrice = Double.valueOf(args[0]);
        Car car = new Car(0, 40, 10);
        car.currentFuel();
        car.refuel();
        car.currentFuel();
        car.distanceLeft();
        System.out.println();
        car.drive(car.getFuelConsumption(), distOdsKryveOzero, distKozJashkiv);
        System.out.println("\nVoyage price: " + fuelPrice * Car.spentFuel +
                " UAN." + " Fuel price: " + fuelPrice + " UAN.");
    }
}
