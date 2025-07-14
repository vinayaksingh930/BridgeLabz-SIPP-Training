public class BubbleSort {
    public static void bubbleSortStudentMarks(int[] marks) {
        int n = marks.length;
        boolean swapped;
        
        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // If current element is greater than next element
                if (marks[j] > marks[j + 1]) {
                    // Swap marks[j] and marks[j+1]
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no swapping occurred in this pass, array is sorted
            if (!swapped) {
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] studentMarks = {78, 65, 90, 82, 70, 88};
        
        System.out.println("Original marks:");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }
        
        bubbleSortStudentMarks(studentMarks);
        
        System.out.println("\nSorted marks:");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }
    }
}