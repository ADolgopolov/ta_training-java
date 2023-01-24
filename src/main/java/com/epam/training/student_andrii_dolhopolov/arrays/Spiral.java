package com.epam.training.student_andrii_dolhopolov.arrays;

class Spiral {

    public static void main(String[] args) {
        {
            int[][] spiral = Spiral.spiral(3, 4);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
        {
            int[][] spiral = Spiral.spiral(4, 3);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
        {
            int[][] spiral = Spiral.spiral(5, 6);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
        {
            int[][] spiral = Spiral.spiral(5, 5);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
    }

    static int[][] spiral(int rows, int columns) {
        int[][] result = new int[rows][columns];

        int counter = 1;
        int startCol = 0;
        int end__Col = columns-1;
        int startRow = 0;
        int end__Row = rows-1;

        int max_c = rows * columns;

        while (startCol <= end__Col && startRow <= end__Row) {
            for (int i = startCol; i <= end__Col; i++){
                result[startRow][i] = counter;
                counter++;
            }
            startRow++;
            if(counter>max_c) break;

            for (int i = startRow; i <= end__Row; i++) {
                result[i][end__Col] = counter;
                counter++;
            }
            end__Col--;
            if(counter>max_c) break;

            for (int i = end__Col; i >= startCol; i--) {
                result[end__Row][i] = counter;
                counter++;
            }
            end__Row--;
            if(counter>max_c) break;

            for (int i = end__Row; i >= startRow; i--) {
                result[i][startCol] = counter;
                counter++;
            }
            startCol++;
            if(counter>max_c) break;
        }

        return result;

    }
}

