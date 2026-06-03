package com.lg.main;

import java.util.Random;

/**
 * TODO：打乱扑克
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage com.lg.main
 * @since 2026-06-02  14:42
 */
public class PokerShuffle {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        pokerStart();
    }

    public static void pokerStart() {
        String[] poker = new String[54];
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int index = 0;
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                poker[index++] = colors[i] + numbers[j];
            }
        }
        poker[index++] = "小王";
        poker[index] = "大王";
        pokerShuffle(poker);
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + " ");
            if ((i + 1) % 13 == 0) System.out.println();
        }
    }

    /**
     * shuffle
     * @param poker
     */
    public static void pokerShuffle(String[] poker){
        for (int i = 0; i < poker.length; i++) {
            int index = RANDOM.nextInt(poker.length);
            String temp = poker[i];
            poker[i] = poker[index];
            poker[index] = temp;
        }
    }
}

