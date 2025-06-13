public class Average {
    int Math=94;
    int Physics=95;
    int Chemistry=96;

    int Avg=(Math + Physics + Chemistry) / 3;
    public static void main(String[] args) {
        Average average = new Average();
        System.out.println("Sam’s average mark in PCM is " + average.Avg);
    }
}
