import java.util.Arrays;
import java.util.Stack;

class StockSpanner {
    // Calculate stock span for each day
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        // For first element, span is always 1
        span[0] = 1;
        stack.push(0);
        
        // Calculate span for rest of the elements
        for (int i = 1; i < n; i++) {
            // Pop elements from stack while stack is not empty
            // and top of stack is less than or equal to current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            
            // If stack becomes empty, then price[i] is greater than all elements on left
            // else price[i] is greater than elements after stack top
            span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            
            // Push this element to stack
            stack.push(i);
        }
        
        return span;
    }
}

// Test the implementation
class Stock {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = StockSpanner.calculateSpan(prices);
        
        System.out.println("Stock Spans:");
        System.out.println(Arrays.toString(span)); // Output: [1, 1, 1, 2, 1, 4, 6]
    }
}