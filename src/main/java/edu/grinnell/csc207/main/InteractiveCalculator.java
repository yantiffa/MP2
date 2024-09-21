package main.java.edu.grinnell.csc207.main;

import java.io.PrintWriter;
import java.util.Scanner;
import mp2.calculator.src.main.java.edu.grinnell.csc207.util.BFCalculator;
import mp2.calculator.src.main.java.edu.grinnell.csc207.util.BFRegisterSet;
import mp2.calculator.src.main.java.edu.grinnell.csc207.util.BigFraction;

public class InteractiveCalculator {
  /**
   * Generate a few fractions and print them out.
   *
   * @param args
   *   Command-line arguments; ignored.
   *
   * @throws Exception
   *   When we have some unexpected I/O issue.
   */
  public static void main() throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    Scanner eyes = new Scanner(System.in);
    String input = eyes.nextLine();
    input = input.trim();
    BFCalculator calculator = new BFCalculator();
    BFRegisterSet register_set = new BFRegisterSet();

    while (!(input.equals("QUIT"))) {
      calculator.clear();
      eyes = new Scanner(System.in);
      input = eyes.nextLine();
      input = input.trim();

      // Split the string
      String[] inputarr = input.split(" ");
      String operator = null;
      BigFraction current = new BigFraction(0,1); // find the current value

      for (String str: inputarr) {
        if (str.equals("+") || str.equals("-") || str.equals("/") || str.equals("*")) { // check if there is no previous number/being cleared in the history
          operator = str;
        } else if(str.startsWith("STORE ")) {
          register_set.store(str.charAt(7), calculator.get());
        } else{
            BigFraction Frac = new BigFraction(str);
            if (operator == null) {
              current = Frac;
            } else if (operator.equals("+")) {
              current.add(Frac);
            } else if (operator.equals("-")) {
              current.minus(Frac);
            } else if (operator.equals("/")) {
              current.divide(Frac); 
            } else {
              current.multiply(Frac); 
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
      }
    }
    eyes.close();
    pen.close();
  } // main(String[])
}
}
