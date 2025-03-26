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
        HashSet<Integer> unique0 = findUniqueInMatrix(matrix0);
        HashSet<Integer> unique1 = findUniqueInMatrix(matrix1);
        HashSet<Integer> unique2 = findUniqueInMatrix(matrix2);
        HashSet<Integer> unique3 = findUniqueInMatrix(matrix3);
        HashSet<Integer> unique4 = findUniqueInMatrix(matrix4);
        System.out.println("Уникальные элементы: " + unique0);
        System.out.println("Уникальные элементы: " + unique1);
        System.out.println("Уникальные элементы: " + unique2);
        System.out.println("Уникальные элементы: " + unique3);
        System.out.println("Уникальные элементы: " + unique4);
    }
}
