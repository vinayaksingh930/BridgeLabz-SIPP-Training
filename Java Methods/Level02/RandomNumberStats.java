
public class RandomNumberStats {
    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        
        System.out.println("Generated 4-digit random numbers:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + randomNumbers[i]);
        }
        
        double[] stats = findAverageMinMax(randomNumbers);
        
        System.out.println("\nStatistics:");
        System.out.println("Average value: " + stats[0]);
        System.out.println("Minimum value: " + (int)stats[1]);
        System.out.println("Maximum value: " + (int)stats[2]);
    }
    
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int)(Math.random() * 9000);
        }
        
        return numbers;
    }
    
    public static double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3];
        
        int min = numbers[0];
        int max = numbers[0];
        double sum = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        
        double average = sum / numbers.length;
        
        result[0] = average;
        result[1] = min;
        result[2] = max;
        
        return result;
    }
}