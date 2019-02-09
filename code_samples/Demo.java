class Box {
  int width;
  int height;
  int depth;
}

public class Demo {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = (a > b) ? (a - b) : (b - a);
    System.out.println("Value of c = " + c);
  }
}