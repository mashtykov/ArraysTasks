package com.company;

import java.util.Random;

public class Arrays {

    public static void main(String[] args) {

        Random r = new Random();
       int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(-10, 10);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;

            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("\nmax = " + max + ", max index = " + maxIndex + ",");
        System.out.println("min = " + min + ", min index = " + minIndex + ".");

    }
}

