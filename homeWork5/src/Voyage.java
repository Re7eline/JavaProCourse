public class Voyage {
    public static double distance = 476;
    public static double distOdsKryveOzero = 178.5;
    public static double distKozJashkiv = 149.6;

    public static void main(String[] args) {
        double fuelPrice = Double.valueOf(args[0]);
        double fuel = Double.valueOf(args[1]);
        double tankCapacity = Double.valueOf(args[2]);
        double fuelConsumption = Double.valueOf(args[3]);
        System.out.println("Fuel price: "+fuelPrice+" Fuel in car: "+fuel+" Tank capacity is: "+tankCapacity+
                " Fuel consumption: "+fuelConsumption);
        Car car = new Car(fuel, tankCapacity, fuelConsumption);
        car.currentFuel();
        car.refuel();
        car.currentFuel();
        car.distanceLeft();
        System.out.println();
        car.drive(car.getFuelConsumption(), distOdsKryveOzero, distKozJashkiv);
        System.out.printf("\nVoyage price: %.2f UAN" , fuelPrice * Car.spentFuel);

    }
}
