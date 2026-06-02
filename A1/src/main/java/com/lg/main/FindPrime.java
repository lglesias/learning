package com.lg.main;

import java.util.Arrays;

/**
 * TODO：找到1-1000中所有的素数
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage com.lg.main
 * @since 2026-06-02  14:12
 */
public class FindPrime {
    public static void main(String[] args) {
        int limit = 1000;
        boolean[] isPrime = sieve(limit);
        System.out.println("Prime number from 1 to 1000");
        int count = 0;
        for (int i = 2; i <= limit; i++) {
            //Check whether the current number is prime.
            if (isPrime[i]) {
                System.out.println(i);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("There are " + count + "prime number in total");
    }

    /**
     * 素数筛选算法
     * @param limit
     * @return
     */
    public static boolean[] sieve(int limit) {
        //Create a boolean array to record whether each number is prime
        boolean[] isPrime = new boolean[limit + 1];
        //Assume all numbers are prime initially
        Arrays.fill(isPrime, true);
        //0 and 1 are not prime numbers
        isPrime[0] = isPrime[1] = false;
        //Starting from 2, traverse through each number in sequence.
        for (int i = 2; i*i <= limit; i++) {
            //If the current number is a prime number, mark its multiples as non-prime.
            if (isPrime[i]) {
                //Start from the square of the current number and traverse all multiples
                for (int j = i * i; j <= limit; j += i) {
                    //Mark all multiples of i as non-prime
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
