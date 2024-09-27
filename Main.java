package app;

public class Main {

    private static final double MILES_TO_KM = 1.609344;

    public static void main(String[] args) {
        System.out.println("Converter App.");
        System.out.println("App for measures converting.");
        System.out.println("Version 1.0.");
    }

    private static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }
}
