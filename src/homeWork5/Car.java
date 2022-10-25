package homeWork5;

public class Car {
    public static double spentFuel;
    public static double fuel;
    public double distance = Voyage.distance;
    private double tankCapacity;
    private double fuelConsumption;

    public Car(double fuel, double tankCapacity, double fuelConsumption) {
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public static void setSpentFuel(double spentFuel) {
        Car.spentFuel = spentFuel;
    }

    public double refuel() {
        double toFull = (getTankCapacity() - getFuel());
        setFuel(toFull + getFuel());
        System.out.printf("\nYou've got +" + toFull + " litres");
        return fuel;
    }

    public void currentFuel() {
        System.out.printf("\nCurrent fuel is: %.2f litres", fuel);
    }

    public void distanceLeft() {
        if (spentFuel == 0) {
            System.out.printf("\nDistance to Kyiv left: %.2f km", distance);
        } else
            System.out.printf("\nDistance to Kyiv left: %.2f km", (distance - (spentFuel / fuelConsumption) * 100));
    }

    public void fuelLeftFor() {

        System.out.printf("\nYou have fuel for: %.2f km", fuel / fuelConsumption * 100);
    }

    public double drive(double fuel, double fuelConsumption,
                        double distance, double distOdsKryveOzero, double distKozJashkiv) {
        double spentFuel1 = distOdsKryveOzero / fuelConsumption;
        setSpentFuel(spentFuel1);
        setFuel(getFuel() - spentFuel1);
        System.out.printf("\nAfter Odesa - Kryve ozero you spent %.2f litres ", spentFuel1);
        currentFuel();
        fuelLeftFor();
        refuel();
        distanceLeft();
        System.out.println();


        double spentFuel2 = distKozJashkiv / fuelConsumption;
        setSpentFuel(spentFuel1 + spentFuel2);
        setFuel(getFuel() - spentFuel2);
        System.out.printf("\nAfter Kryve ozero - Jashkiv you spent: %.2f litres ", spentFuel2);
        currentFuel();
        fuelLeftFor();
        refuel();
        distanceLeft();
        System.out.println();
        return spentFuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}

