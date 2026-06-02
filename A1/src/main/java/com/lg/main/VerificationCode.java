package com.lg.main;

import java.util.Random;
import java.util.Scanner;

/**
 * TODO：可以生成一个指定位数的验证码，验证码由数字和字母组成。
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage com.lg.main
 * @since 2026-06-02  13:38
 */
public class VerificationCode {
    private static final Random RANDOM = new Random();


    public static void main(String[] args) {
        System.out.println("Please enter the required length for the verification code.");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.println(getCode(length));

    }

    /**
     * @param length 验证码长度
     * @return code
     */
    public static String getCode(Integer length) {
        StringBuilder stringBuilder = new StringBuilder(length);
        for (Integer i = 0; i < length; i++) {
            //0:number, 1:lowercase, 2:Uppercase
            int type = RANDOM.nextInt(3);
            switch (type) {
                case 0:
                    stringBuilder.append(RANDOM.nextInt(10));
                    break;
                case 1:
                    stringBuilder.append((char) (RANDOM.nextInt(26) + 'a'));
                    break;
                case 2:
                    stringBuilder.append((char) (RANDOM.nextInt(26) + 'A'));
                    break;
            }
        }
        return stringBuilder.toString();
    }
}
