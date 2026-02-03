import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculate calculate = new Calculate();

        final int MIN_HEIGHT_CM = 50;   // 0.5 m
        final int MAX_HEIGHT_CM = 250;  // 2.5 m
        final int MIN_WEIGHT_KG = 10;   // very light
        final int MAX_WEIGHT_KG = 300;  // very heavy

        int heightCm = -1;
        int weightKg = -1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("|===> ĶMI kalkulātors <===|");

        // ----- Height ---------------------------------------------------------
        while (true) {
            System.out.print("Ievadiet augumu centimetros: ");
            if (scanner.hasNextInt()) {
                heightCm = scanner.nextInt();
                // calculate.setHeight(heightCm) ;
                if (heightCm >= MIN_HEIGHT_CM && heightCm <= MAX_HEIGHT_CM) {
                    break;
                } else {
                    System.out.printf(
                        "Augumam jābūt starp %d cm un %d cm.%n",
                        MIN_HEIGHT_CM, MAX_HEIGHT_CM);
                }
            } else {
                System.out.println("Ievadiet veselu skaitli.");
                scanner.next();               // discard invalid token
            }
        }

        // ----- Weight ---------------------------------------------------------
        while (true) {
            System.out.print("Ievadiet masu kilogramos: ");
            if (scanner.hasNextInt()) {
                weightKg = scanner.nextInt();
                // calculate.setWeight(weightKg) ;
                if (weightKg >= MIN_WEIGHT_KG && weightKg <= MAX_WEIGHT_KG) {
                    break;
                } else {
                    System.out.printf(
                        "Masai jābūt starp %d kg un %d kg.%n",
                        MIN_WEIGHT_KG, MAX_WEIGHT_KG);
                }
            } else {
                System.out.println("Ievadiet veselu skaitli.");
                scanner.next();               // discard invalid token
            }
        }

        // ----- Calculate ------------------------------------------------------
        double bmiRounded = calculate.bmwCalc(heightCm,weightKg);

        // ----- Category -------------------------------------------------------
        String category = calculate.catagory(bmiRounded);

        // ----- Output ---------------------------------------------------------
        System.out.println("\nJūsu ĶMI: " + bmiRounded);
        System.out.println("Kategorija: " + category);

        scanner.close();
    }
}