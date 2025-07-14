import java.util.Stack;

class QueueUsingStacks {
    Stack<Integer> stack1; // For enqueue operations
    Stack<Integer> stack2; // For dequeue operations
    
    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    // Add element to the queue
    public void enqueue(int x) {
        stack1.push(x);
    }
    
    // Remove element from the queue
    public int dequeue() {
        // If stack2 is empty, transfer all elements from stack1
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        
        // If stack2 is still empty, queue is empty
        if (stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        
        return stack2.pop();
    }
    
    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

// Test the implementation
class QueueUsingStacksTest {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.dequeue()); // Output: 2
        
        queue.enqueue(4);
        System.out.println(queue.dequeue()); // Output: 3
        System.out.println(queue.dequeue()); // Output: 4
    }
}