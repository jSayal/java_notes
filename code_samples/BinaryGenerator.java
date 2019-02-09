import java.util.*;

class BinaryGenerator {
  public static vo  id main(String[] args) {
    System.out.println("This program will take names of people and gives it's binary" 
      + " representation."
    );
    System.out.print("Enter your name: ");

    // Get user input
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    scanner.close();

    // Convert each letter in input string to it's binary format
    try {
      // Convert user's name to byte array
      byte[] nameBytes = name.getBytes();
      int number = 0;
      String cumulativeBinary = "";

      for(Byte b: nameBytes) {
        String binary = "";
        number = b;
        do {
          switch(number % 2) {
            case 1:
              binary = "1" + binary;
              cumulativeBinary = "1" + cumulativeBinary;
              break;
            case 0:
              binary = "0" + binary;
              cumulativeBinary = "0" + cumulativeBinary;
              break;
          }
          
          number >>= 1;

        } while (number > 0);

        System.out.print("Binary of ");
        System.out.print((Character.toChars(b)));
        System.out.print(" is " + binary + "\n");
        cumulativeBinary = "-" + cumulativeBinary;
      }
      
      System.out.println("");
      System.out.println("");
      System.out.println(cumulativeBinary);
    } catch(Exception e) {
      System.out.println("ERROR: Enter a number in decimal. For example 1, 20, 34344 etc.");
    }
  }
}