package base;

import java.util.Scanner;

public class CurrencyConversion {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    CurrencyConversion newCurrency = new CurrencyConversion();
    double e = newCurrency.euros();
    double c = newCurrency.conversion();
    System.out.println(newCurrency.dollars(e, c));
  }

  public double euros() {
    System.out.print("How many euros are you exchanging? ");
    return input.nextDouble();
  }

  public double conversion() {
    System.out.print("What is the exchange rate? ");
    return input.nextDouble();
  }

  public String dollars(double e, double c) {
    System.out.printf("%.2f euros at an exchange rate of %.4f is%n", e, c);
    return String.format("%.2f U.S. Dollars.", e * c);
  }
}
