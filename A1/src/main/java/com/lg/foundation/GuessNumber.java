package com.lg.main;

import java.util.Scanner;

/**
 * TODO：猜数字游戏，计算机随机生成一个三位数，
 *      用户输入一个数字，计算机判断数字大小，
 *      如果猜对了，游戏结束，否则继续猜
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage com.lg.main
 * @since 2026-06-02  13:18
 */
public class GuessNumber {
    public static void main(String[] args) {
        while (true) {
            guessNumber();
            if (scannerNumber() == 2) {
                System.out.println("Game Over");
                break;
            } else {

                int systemNumber = (int) (Math.random() * 100);
                int playerInput = 0;
                while (true) {
                    System.out.println("Please enter number.");
                    playerInput = scannerNumber();
                    ifOrNot(systemNumber, playerInput);
                    if (systemNumber == playerInput) {
                        System.out.println("Game Over");
                        break;
                    }
                }
            }


        }
    }

    /**
     * Game menu
     */
    public static void guessNumber() {
        System.out.println("====The Game Begins====");
        System.out.println("1.Start Game");
        System.out.println("2.Exit Game");

    }

    /**
     * Get a number from the user.
     *
     * @return
     */
    public static int scannerNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    /**
     * Compare numbers
     *
     * @param systemNumber 系统生产的数字
     * @param playerInput  玩家输入的数字
     */
    public static void ifOrNot(Integer systemNumber, Integer playerInput) {
        if (systemNumber > playerInput) {
            System.out.println("Too Low");
        } else if (systemNumber < playerInput) {
            System.out.println("Too high");
        } else {
            System.out.println("You got it!");
        }
    }
}
