public class SelectionSort {
    public static void selectionSortExamScores(int[] scores) {
        int n = scores.length;
        
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] examScores = {88, 72, 95, 65, 79, 84, 91};
        
        System.out.println("Original exam scores:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
        
        selectionSortExamScores(examScores);
        
        System.out.println("\nSorted exam scores:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}