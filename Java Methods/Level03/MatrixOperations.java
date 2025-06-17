public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrixA = createRandomMatrix(3, 3);
        int[][] matrixB = createRandomMatrix(3, 3);
        
        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        
        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);
        
        int[][] sumMatrix = addMatrices(matrixA, matrixB);
        System.out.println("\nMatrix A + Matrix B:");
        displayMatrix(sumMatrix);
        
        int[][] diffMatrix = subtractMatrices(matrixA, matrixB);
        System.out.println("\nMatrix A - Matrix B:");
        displayMatrix(diffMatrix);
        
        int[][] productMatrix = multiplyMatrices(matrixA, matrixB);
        System.out.println("\nMatrix A * Matrix B:");
        displayMatrix(productMatrix);
    }
    
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); 
            }
        }
        
        return matrix;
    }
    
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        
        if (rows != matrixB.length || cols != matrixB[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition");
        }
        
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        return result;
    }
    
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        
        if (rows != matrixB.length || cols != matrixB[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for subtraction");
        }
        
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        
        return result;
    }
    
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;
        
        if (colsA != rowsB) {
            throw new IllegalArgumentException("Number of columns in first matrix must equal number of rows in second matrix");
        }
        
        int[][] result = new int[rowsA][colsB];
        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        return result;
    }
    
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}