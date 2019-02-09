/**
 * Class to test stack implementation and containing main method.
 */
public class TestStack {
  public static void main(String[] args) {
    Stack s1 = new Stack();

    // Trying to store 11 items on stack
    for(int i = 1; i <= 12; i++) {
      s1.push(i * 10);
    }

    // Trying to get all the items from stack
    for(int i = -1; i < 12; i++) {
      System.out.println("Popped value is " + s1.pop());
    }
  }
}

/**
 * This class defines an integer stack that hold ten values.
 * It is very naive representation of stack with serious issues 
 * (1) The instance variable stck array that holds all the values can be accessed by code outside 
 *     of class. It should be protected. We will cover this later with access modifiers.
 * (2) Stack has a limitation of only 10 items, theoratically it should not have any limits.
 * (3) The stack is not thread safe and since we have covered thread at this time, we are not 
 *     worrying about thread safety.
 */ 
class Stack {
  // Instance variables
  int[] stck = new int[10];
  int index;

  // Constructor
  Stack() {
    index = -1;
  }

  // Store new item on stack
  void push(int item) {
    if (index == 9) {
      System.out.println("Stack is full.");
    } else {
      stck[++index] = item;
    }
  }

  // Retrieve last item stored on stack
  int pop() {
    if (index < 0) {
      return 0;
    } else {
      return stck[index--];
    }
  }
}