import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<UsedCar> validCars = new ArrayList<>();

        while(t-- > 0){
            String line = sc.nextLine();
            String[] parts = line.split(",");

            String vin = parts[0].trim();
            String make = parts[1].trim();
            int year = Integer.parseInt(parts[2].trim());
            int mileage = Integer.parseInt(parts[3].trim());
            int price = Integer.parseInt(parts[4].trim());

            try {
                UsedCar car = new UsedCar(vin, make, year, mileage, price);
                validCars.add(car);
            } catch (UsedCarException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("List of successfully constructed UsedCar objects:");
        if (validCars.isEmpty()) {
            System.out.println("No used cars");
        } else {
            for (UsedCar car : validCars) {
                System.out.println(car);
            }
        }
    }
}

class UsedCarException extends Exception {
    public UsedCarException(String VIN){
        super("Invalid UsedCar: VIN " + VIN);
    }
}

class UsedCar {
    private String VIN;
    private String make;
    private int year;
    private int mileage;
    private int price;

    private static final Set<String> makeAvailable = new HashSet<>();
    static {
        makeAvailable.add("Ford");
        makeAvailable.add("Honda");
        makeAvailable.add("Toyota");
        makeAvailable.add("Chrysler");
    }

    public UsedCar(String VIN, String make, int year, int mileage, int price) throws UsedCarException {
        if (!VIN.matches("\\d{4}") ||
                !makeAvailable.contains(make) ||
                year < 1990 || year > 2014 ||
                mileage < 0 || price < 0) {
            throw new UsedCarException(VIN);
        }

        this.VIN = VIN;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("UsedCar{vin='%s', make='%s', year=%d, mileage=%d, price=%.1f}",
                VIN, make, year, mileage, (double)price);
    }
}
