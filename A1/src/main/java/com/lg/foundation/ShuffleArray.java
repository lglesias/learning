package com.lg.main;


import java.util.Random;
import java.util.Scanner;

/**
 * TODO：打乱二维数组
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage com.lg.main
 * @since 2026-06-02  14:53
 */
public class ShuffleArray {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        int number = scan();
        int[][] array = new int[number][number];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * array.length + j + 1;
            }
        }
        printArray(array);//Print the array
        shuffleArray(array);//Shuffle the array
        System.out.println("Shuffled Array");
        printArray(array);//Print the shuffled array

    }


    /**
     * Get a number from the user.
     *
     * @return
     */
    public static int scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows and columns.");
        return scanner.nextInt();
    }

    /**
     * Print the array
     *
     * @param array
     */
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Shuffle the array
     *
     * @param array
     */
    public static void shuffleArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                //Generate a random row index
                int row = RANDOM.nextInt(array.length);
                //Generate a random column index
                int col = RANDOM.nextInt(array[i].length);
                //Swap the elements
                int temp = array[i][j];
                array[i][j] = array[row][col];
                array[row][col] = temp;
            }
        }
    }

}
