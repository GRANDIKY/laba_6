package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вводим длину: ");
        int len = in.nextInt();
        int[] array = new int[len];
        System.out.println("Вводим элементы:");
        for (int i = 0; i < len; i++) {
            array[i] = in.nextInt();
        }
        in.close();
        combSort(array);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }

    public static void combSort(int[] array) {
        double factor = 1.247;
        int step = array.length - 1;
        while (step >= 1) {
            System.out.println(Arrays.toString(array));
            for (int i = 0; i + step < array.length; ++i) {
                if (array[i] > array[i + step]) {
                    swap(array, i, i + step);
                }
            }
            step /= factor;
            System.out.println(step);
        }
    }


    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
