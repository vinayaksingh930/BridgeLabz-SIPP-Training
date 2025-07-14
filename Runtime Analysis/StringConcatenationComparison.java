public class StringConcatenationComparison {
    public static void main(String[] args) {
        int n = 1_000_000;
        String str = "hello";

        // String
        long startTime = System.nanoTime();
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        long endTime = System.nanoTime();
        System.out.println("String Time: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // StringBuilder
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append(str);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}