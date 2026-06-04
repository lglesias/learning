package src.main.java.com.lg.oop.GasStationPaymentTest;

import java.util.Scanner;

/**
 * TODO：功能描述
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage src.main.java.com.lg.oop
 * @since 2026-06-04  15:48
 */
public class GasStationPaymentTest {
    public static void main(String[] args) {


        System.out.println("Please enter the deposit amount:");
        Scanner scanner = new Scanner(System.in);
        //get the deposit amount
        double depositAmount = scanner.nextDouble();
        //check gold card or silver card
        if (depositAmount >= 5000) {
            //create gold card
            GoldCard goldCard = new GoldCard(123456, "LG", "1234567890", depositAmount);
            pay(goldCard);
        } else {
            //create silver card
            SilverCard silverCard = new SilverCard(123456, "LG", "1234567890", depositAmount);
            pay(silverCard);
        }


    }


    //pay
    public static void pay(CardInformation cardInformation) {
        System.out.println("Please enter your current consumption amount.");
        Scanner scanner = new Scanner(System.in);
        double CardBalance = scanner.nextDouble();
        cardInformation.WithdrawalAmount(CardBalance);
    }
}
