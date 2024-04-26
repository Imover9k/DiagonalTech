import java.util.Scanner;

public class NumberToWord {
    private static final String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    private static final String[] teens = {
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String numberToWord(int num) {
        if (num == 0) {
            return "Zero";
        }

        String word = "";

        if (num < 0) {
            word += "Negative ";
            num = -num;
        }

        if (num >= 1000) {
            word += numberToWord(num / 1000) + " Thousand ";
            num %= 1000;
        }

        if (num >= 100) {
            word += units[num / 100] + " Hundred ";
            num %= 100;
        }

        if (num >= 20) {
            word += tens[num / 10] + " ";
            num %= 10;
        } else if (num >= 10) {
            word += teens[num - 10] + " ";
            num = 0;
        }

        if (num > 0) {
            word += units[num] + " ";
        }

        return word.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        String wordRepresentation = numberToWord(num);
        System.out.println("Word representation: " + wordRepresentation);

        scanner.close();
    }
}
