package com.konrad.algoexpertexercises;

import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);

        System.out.println(sequence.size());

        List<Integer> array2 = Arrays.asList(1, 2, 3, 4);
        List<Integer> sequence2 = Arrays.asList(1, 3, 4);

        List<Integer> array3 = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence3 = Arrays.asList(25);

        System.out.println(isValidSubsequence(array3, sequence3));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals(sequence.get(index))) {
                index++;
                count++;
            }
            if (sequence.size() - 1 < index) {
                return sequence.size() == index;
            }
        }
        return sequence.size() == index;
    }
}
