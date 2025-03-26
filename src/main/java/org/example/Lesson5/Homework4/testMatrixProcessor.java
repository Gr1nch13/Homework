package org.example.Lesson5.Homework4;

import java.util.HashSet;

public class testMatrixProcessor extends MatrixProcessor{
    public static void main(String[] args) {
        int[][] matrix0 = {
                {1, 1, 2},
                {3, 5, 8},
                {13, 21, 34}
        };

        int[][] matrix1 = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {4, 5, 6, 7}
        };

        int[][] matrix2 = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        int[][] matrix3 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        int[][] matrix4 = {
                {}
        };


        HashSet<Integer> unique = findUniqueInMatrix(matrix0);
        System.out.println("Уникальные элементы: " + unique);
        unique = findUniqueInMatrix(matrix1);
        System.out.println("Уникальные элементы: " + unique);
        unique = findUniqueInMatrix(matrix2);
        System.out.println("Уникальные элементы: " + unique);
        unique = findUniqueInMatrix(matrix3);
        System.out.println("Уникальные элементы: " + unique);
        unique = findUniqueInMatrix(matrix4);
        System.out.println("Уникальные элементы: " + unique);
    }
}
