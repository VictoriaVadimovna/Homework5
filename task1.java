package com.allevel.lesson05;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int[] array = createArray(7);
        System.out.println(Arrays.toString(createArray(7)));
        int[] newArray = sortArray(array);
        System.out.println(Arrays.toString(newArray));


    }

    private static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // i - номер текущего шага
            int indexMinElement = i;
            int min = array[i];

// цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    indexMinElement = j;
                    min = array[j];
                }
            }
            //меняем местами min наименьший с array[i]
            array[indexMinElement] = array[i];
            array[i] = min;
        }
        return array;
    }


    private static int[] createArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int)(Math.random()* 99 + 1);
        }

        return array;
    }
}
