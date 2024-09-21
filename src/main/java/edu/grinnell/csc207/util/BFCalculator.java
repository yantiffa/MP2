package main.java.edu.grinnell.csc207.util;

public class BFCalculator {
  // +--------+-------------------------------------------------------
  // | Fields |
  // +--------+

  /** The last value stored */
  private BigFraction last_num;

  // +--------------+-------------------------------------------------
  // | Constructors |
  // +--------------+

  //Initialize the last_num
  public BFCalculator() {
    this.last_num = new BigFraction(0, 1);
  } // BFCalculator()

  // +---------+------------------------------------------------------
  // | Methods |
  // +---------+
  public BigFraction get() {
    return this.last_num;                 
  } // get()

  //adds val to the last computed value.
  public void add(BigFraction val) {
    this.last_num = this.last_num.add(val).Simplest();
  } // add()

  //subtracts val from the last computed value.
  public void subtract(BigFraction val) {
    this.last_num = this.last_num.minus(val).Simplest();
  } // subtract()

  //multiplies the last computed value by val.
  public void multiply(BigFraction val) {
    this.last_num = this.last_num.multiply(val).Simplest();
  } // multiply()

  //divides the last computed value by val.
  public void divide(BigFraction val) {
    this.last_num = this.last_num.divide(val).Simplest();
  } // divide()

  //resets the last computed value to 0.
  public void clear() {
    this.last_num = new BigFraction(0,1);
  }
}
