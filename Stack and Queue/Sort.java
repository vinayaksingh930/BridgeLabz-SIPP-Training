import java.util.Stack;

class StackSorter {
    // Sort stack recursively
    public static void sortStack(Stack<Integer> stack) {
        // Base case: if stack is empty or has only one element
        if (stack.isEmpty() || stack.size() == 1) {
            return;
        }
        
        // Remove the top element
        int temp = stack.pop();
        
        // Sort the remaining stack
        sortStack(stack);
        
        // Insert the top element in the correct position
        insertSorted(stack, temp);
    }
    
    // Helper method to insert an element in sorted order
    private static void insertSorted(Stack<Integer> stack, int value) {
        // Base case: if stack is empty or value is greater than top element
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value);
            return;
        }
        
        // Remove top element and recur
        int temp = stack.pop();
        insertSorted(stack, value);
        
        // Put back the removed element
        stack.push(temp);
    }
}

// Test the implementation
public class Sort {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(7);
        stack.push(1);
        stack.push(9);
        
        StackSorter.sortStack(stack);
        
        System.out.println("Sorted Stack:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // Output: 9 7 5 2 1
        }
    }
}