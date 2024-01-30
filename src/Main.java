import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // initializes answer
        String answer = "";

        // as long as answer does not become "F", code will run
        while (true) {

            double fahr = userInput();

            toCelsius(fahr);

            finalMessage(fahr, toCelsius(fahr));

            //asks user if they'd like to check another temperature
            Scanner userInput = new Scanner(System.in);
            System.out.println("Would you like to check again? (Y/N) ");
            answer = userInput.nextLine();

            //ends the program if user input is "F", if it's anything else the code still runs
            if (answer == "N") {
                break;
            }
        }
    }

    // collects user input
    static double userInput() {
        Scanner fahrenheit = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double userFahrenheit = fahrenheit.nextDouble();

        return userFahrenheit;
    }

    // changes user input to Celsius
    static double toCelsius(double a) {
        // converts fahrenheit to celsius
        double celsius = (a - 32) / 1.8;

        return celsius;
    }

    // tells the user their initial temperature in Fahrenheit, and then the temperature in Celsius
    static void finalMessage(double a, double b) {
        // rounds all decimals to 2 decimal places
        DecimalFormat dcf = new DecimalFormat("###.##");

        System.out.println(dcf.format(a) + " degrees in Fahrenheit would be equal to...");

        System.out.println(dcf.format(b) + " Celsius!");

    }
}