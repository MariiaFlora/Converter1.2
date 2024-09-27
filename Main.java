package app;

public class Main {

    private static final double MILES_TO_KM = 1.609344;

    private static final double KM_TO_MILES = 0.621371;

    public static void main(String[] args) {
        System.out.println("Converter App.");
        System.out.println("App for measures converting.");
        System.out.println("Version 1.0.");
    }

    private static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    private static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

}
