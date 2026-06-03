package src.main.java.com.lg.foundation;

import java.util.Scanner;

/**
 * TODO：查找任意位数中所有水仙花数
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage src.main.java.com.lg.main
 * @since 2026-06-03  12:58
 */
public class AllNarcissistic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Number of digits(1-10).");
        int digits = scanner.nextInt();
        if (digits < 1 || digits > 10) {
            System.out.println("Please enter the correct number of digits.");
            return;
        }
        //Get the start and end of the range
        long start = 1;
        for (int i = 1; i < digits; i++) {
            start *= 10;
        }
        long end = start * 10 - 1;

        System.out.println("Finding " + digits + "-digit Armstrong numbers...");
        System.out.println("range: " + start + " to " + end);

        int count = 0;
        for (long num = start; num <= end; num++) {
            if (isNarcissistic(num, digits)) {
                System.out.println(num);
                count++;
            }
        }

    }

    //Find all Narcissistic numbers within a given range.
    private static boolean isNarcissistic(long num, int digits) {
        //Calculate the sum of the digits raised to the power of the number of digits.
        long sum = 0;
        //Get each digit.
        long temp = num;
        while (temp > 0) {
            long digit = temp % 10;
            long power = 1;
            for (int i = 1; i <= digits; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }
        return sum == num;
    }
}
