import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MonetaryValueFormatter {

    public static String formatMonetaryValue(double value, boolean useNepaliUnits) {
        DecimalFormat decimalFormat;
        if (useNepaliUnits) {
            decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(new Locale("ne", "NP"));
            decimalFormat.applyPattern("#,##0.00");
        } else {
            decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
            decimalFormat.applyPattern("#,##0.00");
        }
        return decimalFormat.format(value);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a monetary value: ");
        double value = scanner.nextDouble();

        String nepaliFormat = formatMonetaryValue(value, true);
        System.out.println("Nepali format: " + nepaliFormat);

        String internationalFormat = formatMonetaryValue(value, false);
        System.out.println("International format: " + internationalFormat);

        scanner.close();
    }
}
