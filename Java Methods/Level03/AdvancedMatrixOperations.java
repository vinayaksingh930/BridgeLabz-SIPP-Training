public class AdvancedMatrixOperations {
    public static void main(String[] args) {
        double[][] matrix2x2 = createRandomMatrix(2, 2);
        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);
        
        double[][] transpose2x2 = findTranspose(matrix2x2);
        System.out.println("\nTranspose of 2x2 Matrix:");
        displayMatrix(transpose2x2);
        
        double det2x2 = findDeterminant2x2(matrix2x2);
        System.out.println("\nDeterminant of 2x2 Matrix: " + det2x2);
        
        try {
            double[][] inverse2x2 = findInverse2x2(matrix2x2);
            System.out.println("\nInverse of 2x2 Matrix:");
            displayMatrix(inverse2x2);
        } catch (ArithmeticException e) {
            System.out.println("\nInverse of 2x2 Matrix: " + e.getMessage());
        }
        
        double[][] matrix3x3 = createRandomMatrix(3, 3);
        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3x3);
        
        double[][] transpose3x3 = findTranspose(matrix3x3);
        System.out.println("\nTranspose of 3x3 Matrix:");
        displayMatrix(transpose3x3);
        
        double det3x3 = findDeterminant3x3(matrix3x3);
        System.out.println("\nDeterminant of 3x3 Matrix: " + det3x3);
        
        try {
            double[][] inverse3x3 = findInverse3x3(matrix3x3);
            System.out.println("\nInverse of 3x3 Matrix:");
            displayMatrix(inverse3x3);
        } catch (ArithmeticException e) {
            System.out.println("\nInverse of 3x3 Matrix: " + e.getMessage());
        }
    }
    
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Math.round((Math.random() * 9) * 10) / 10.0; // Random numbers 0-9 with 1 decimal place
            }
        }
        
        return matrix;
    }
    
    public static double[][] findTranspose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        double[][] transpose = new double[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        return transpose;
    }
    
    public static double findDeterminant2x2(double[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2");
        }
        
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
    
    public static double findDeterminant3x3(double[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3");
        }
        
        double a = matrix[0][0];
        double b = matrix[0][1];
        double c = matrix[0][2];
        double d = matrix[1][0];
        double e = matrix[1][1];
        double f = matrix[1][2];
        double g = matrix[2][0];
        double h = matrix[2][1];
        double i = matrix[2][2];
        
        return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
    }
    
    public static double[][] findInverse2x2(double[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2");
        }
        
        double det = findDeterminant2x2(matrix);
        
        if (Math.abs(det) < 1e-10) {
            throw new ArithmeticException("Matrix is singular, cannot find inverse");
        }
        
        double[][] inverse = new double[2][2];
        
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;
        
        return inverse;
    }
    
    public static double[][] findInverse3x3(double[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3");
        }
        
        double det = findDeterminant3x3(matrix);
        
        if (Math.abs(det) < 1e-10) {
            throw new ArithmeticException("Matrix is singular, cannot find inverse");
        }
        
        double[][] inverse = new double[3][3];
        
        double[][] cofactor = new double[3][3];
        
        cofactor[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        cofactor[0][1] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        cofactor[0][2] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
        
        cofactor[1][0] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        cofactor[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        cofactor[1][2] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);
        
        cofactor[2][0] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        cofactor[2][1] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        cofactor[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        
        double[][] adjoint = findTranspose(cofactor);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adjoint[i][j] / det;
            }
        }
        
        return inverse;
    }
    
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.printf("%.2f\t", element);
            }
            System.out.println();
        }
    }
}