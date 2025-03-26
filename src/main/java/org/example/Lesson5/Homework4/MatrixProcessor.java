package org.example.Lesson5.Homework4;

import java.util.HashSet;

public class MatrixProcessor {
    public static HashSet<Integer> findUniqueInMatrix(int[][] matrix){
        HashSet<Integer> uniqueElements = new HashSet<>();
        if(matrix.length == 0){
            return uniqueElements;
        }
        for (int[] row : matrix){
            for (int element : row) {
                uniqueElements.add(element);
            }
        }
        return uniqueElements;
    }
}
