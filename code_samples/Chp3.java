/**
 * The following class demonstrate all the primitive data types
 * available in Java.
 */
class Chp3 {
  public static void main(String[] args) {
    // DemonstrateByteAndShortType();
    DemonstrateIntType();
  }

  static void DemonstrateByteAndShortType() {
    // Integer literals in Java are considered as 32 bit type int values.
    // Then why the two statements below do not create any type mismatch errors.
    // If assinged values are within the range of byte and short, Java will do
    // automatic narrowing conversion. For other narrowing conversions, we have to 
    // explicitly cast values.
    byte b = 20;
    short s = 100;

    System.out.println("Expression involving byte and short");
    System.out.println("-------------------------------------");
    /*
      When byte or short variable types are used in an expression, they are 
      automatically promoted to int type. So for number with fractional parts, it's
      best to use int data type.
      byte data type can used for byte arrays, that we will discuss later. 
     */
    System.out.println("b = " + b);
    System.out.println("b X 2 = " + b * 2);   // automatic data type promotion

    System.out.println("s = " + s);
    System.out.println("s X 2 " + s * 2);     // automatic data type promotion
  }

  static void DemonstrateIntType() {
    int num1 = 20_000;
    int num2 = 2312;
    System.out.println(num1/num2);    // interger division will result in an integer value

    System.out.println(num1/2312.0);  // If one number is of type float/double in expression
                                      // the result is automatically widended to the widest type.
                                      // All floating point literals are considered as double
                                      // type in Java so here the resulting expression is of
                                      // type double.
    
    System.out.println("Max value of int type is " + Integer.MAX_VALUE);
    System.out.println("Max value of float is " + Float.MAX_VALUE);
  }
}