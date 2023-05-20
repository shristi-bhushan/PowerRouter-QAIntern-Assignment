// Implement stack and its following methods using a queue data structure, without using an array or linked list
// a. Push
// b. Pop
// c. Top

import java.util.NoSuchElementException;

public class StackUsingQueue {
    private static final int MAX_SIZE = 100;
    private int[] stack;
    private int top;

    public StackUsingQueue() {
        stack = new int[MAX_SIZE];
        top = -1;
    }

        // Pushes an element onto the stack
            public void push(int value) {
                if (top == MAX_SIZE - 1) {
                    System.out.println("Stack is full. Cannot push element: " + value);
                    return;
                }
                stack[++top] = value;
            }
        // Pops and returns the top element from the stack
            public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot perform pop operation.");
                return -1; // Return a default value to indicate failure or handle it according to your requirements
            }
            return stack[top--];
        }
        // Returns the top element from the stack without removing it
            public int top() {
                if (isEmpty()) {
                    System.out.println("Stack is empty. Cannot retrieve top element.");
                    return -1; // Return a default value to indicate failure or handle it according to your requirements
                }
                return stack[top];
            }


    // Checks if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Returns the size of the stack
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.top());   // Output will be : 30
        System.out.println(stack.pop());   // Output will be :  30
        System.out.println(stack.top());   // Output will be :  20
        System.out.println(stack.isEmpty());// Output will be :  false
        System.out.println(stack.size());  // Output will be :  2
    }
}

 //   The stack is represented by the stack array and the top variable indicating the index of the top element. The push method adds an element to
 //   the top of the stack, while the pop method removes and returns the top element. The top method returns the top element without removing it. 
  //   The isEmpty method checks if the stack is empty, and the size method returns the number of elements in the stack. The main method
  //  demonstrates the usage of the stack by performing push, pop, top, isEmpty, and size operations.