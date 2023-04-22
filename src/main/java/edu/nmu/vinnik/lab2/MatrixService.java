package edu.nmu.vinnik.lab2;

import java.util.Random;
import java.util.Scanner;

public class MatrixService {
    static final int MAX_COLUMN_COUNT = 20;
    static final int MIN_COLUMN_COUNT = 1;
    static final int MAX_ROW_COUNT = 20;
    static final int MIN_ROW_COUNT = 1;
    static final int MAX_RANDOM_VALUE = 100;
    static final int MIN_RANDOM_VALUE = -100;
    public static final int SPECIFIC_VALUES = 1;
    public static final int RANDOM_VALUES = 2;

    public int[][] create () {
        int[][] matrix;
        int input;
        String errorMessage = "You should choose between "+SPECIFIC_VALUES+" and "+RANDOM_VALUES+" options";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set size of the matrix.");

        int rows = getValue(
                "Enter number of rows between " + MIN_ROW_COUNT + " and " + MAX_ROW_COUNT + ": ",
                MIN_ROW_COUNT,
                MAX_ROW_COUNT,
                scanner
        );
        int columns = getValue(
                "Enter number of columns between " + MIN_COLUMN_COUNT + " and " + MAX_COLUMN_COUNT + ": ",
                MIN_COLUMN_COUNT,
                MAX_COLUMN_COUNT,
                scanner
        );

        while (true) {
            System.out.println("How do you want to fill the matrix with values? (" + SPECIFIC_VALUES + "/" + RANDOM_VALUES + ")");
            System.out.println(SPECIFIC_VALUES + ". Type elements yourself.");
            System.out.println(RANDOM_VALUES + ". Set elements randomly.");
            System.out.println();

            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input == SPECIFIC_VALUES) {
                    matrix = getCustomMatrix(rows, columns);
                    break;
                }
                else if (input == RANDOM_VALUES) {
                    matrix = getRandomMatrix(rows, columns);
                    break;
                }
                else {
                    System.out.println(errorMessage);
                }
            }
            else {
                System.out.println(errorMessage);
            }
            scanner.nextLine();
        }

        scanner.close();

        return matrix;
    }

    public void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public int getMaxValue(int[][] matrix){
        int max = matrix[0][0];

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }

        return max;
    }

    public int getMinValue(int[][] matrix) {
        int min = matrix[0][0];

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] < min) {
                    min = ints[j];
                }
            }
        }

        return min;
    }

    public double getArithmeticMean(int[][] matrix) {
        double sumOfElements = 0;

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                sumOfElements += ints[j];
            }
        }

        return sumOfElements / (matrix.length * matrix[0].length);
    }

    public double getGeometricMean(int[][] matrix) {
        int productOfElements = 1;

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                productOfElements *= ints[j];
            }
        }

        return Math.pow(productOfElements, 1.0 / (double) (matrix.length * matrix[0].length));
    }

    private int getValue(String message, int minValue, int maxValue, Scanner scanner) {
        int number = 0;
        String errorMessage = "You should write number between " + minValue + " and " + maxValue;

        while (isNumberValid(number, minValue, maxValue)) {
            System.out.println(message);

            if (scanner.hasNextInt()) {
                number = scanner.nextInt();

                if (isNumberValid(number, minValue, maxValue)) {
                    System.out.println(errorMessage);
                }

                scanner.nextLine();
            }
            else {
                System.out.println(errorMessage);

                scanner.nextLine();
            }
        }

        return number;
    }

    private boolean isNumberValid (int number, int minValue, int maxValue) {
        return number < minValue || number > maxValue;
    }

    private int[][] getCustomMatrix(int inputRows, int inputColumns) {
        int[][] matrix = new int[inputRows][inputColumns];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Row " + (i + 1) + ", Column " + (j + 1) + " element: ");

                if (scanner.hasNextInt()) {
                    matrix[i][j] = scanner.nextInt();

                    scanner.nextLine();

                    System.out.println();
                }
            }
        }

        return matrix;
    }

    private int[][] getRandomMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];

        int diff = MAX_RANDOM_VALUE - MIN_RANDOM_VALUE;

        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = rand.nextInt(diff + 1) + MIN_RANDOM_VALUE;
            }
        }

        return matrix;
    }
}
