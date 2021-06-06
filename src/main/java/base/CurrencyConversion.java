/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Harding
 */

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
    String n = input.next();
    try {
      Double.parseDouble(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Invalid Value! Try Again.");
      return euros();
    }
    return Double.parseDouble(n);
  }

  public double conversion() {
    System.out.print("What is the exchange rate? ");
    String n = input.next();
    try {
      Double.parseDouble(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Invalid Value! Try Again.");
      return conversion();
    }
    return Double.parseDouble(n);
  }

  public String dollars(double e, double c) {
    System.out.printf("%.2f euros at an exchange rate of %.4f is%n", e, c);
    return String.format("%.2f U.S. Dollars.", e * c);
  }
}
