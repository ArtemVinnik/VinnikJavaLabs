package edu.nmu.vinnik;

import edu.nmu.vinnik.lab2.MatrixService;
import edu.nmu.vinnik.lab5.services.StudentService;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        StudentService studentService = new StudentService();

        studentService.displayStudentsByMonth();
    }

    private void displayMatrix() {
        MatrixService matrixService = new MatrixService();

        int[][] matrix = matrixService.create();

        matrixService.printMatrix(matrix);

        int min = matrixService.getMinValue(matrix);
        int max = matrixService.getMaxValue(matrix);

        double arithmeticMean = matrixService.getArithmeticMean(matrix);
        double geometricMean = matrixService.getGeometricMean(matrix);

        System.out.println("Min value of the matrix: " + min);
        System.out.println("Max value of the matrix: " + max);
        System.out.println("Arithmetic mean: " + arithmeticMean);
        System.out.println("Geometric mean: " + geometricMean);
    }
}
