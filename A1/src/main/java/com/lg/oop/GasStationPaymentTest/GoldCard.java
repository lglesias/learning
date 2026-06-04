package src.main.java.com.lg.oop.GasStationPaymentTest;

/**
 * TODO：gold card
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage src.main.java.com.lg.oop
 * @since 2026-06-04  15:59
 */
public class GoldCard extends CardInformation {
    public GoldCard(int licensePlates, String name, String telephoneNumber, double CardBalance) {
        super(licensePlates, name, telephoneNumber, CardBalance);
    }

    /**
     * Deposit amount
     *
     * @param CardBalance
     */
    @Override
    public void DepositAmount(double CardBalance) {
        setCardBalance(getCardBalance() + CardBalance);
        System.out.println("Your current balance is: $" + getCardBalance());
    }

    /**
     * Withdrawal amount
     *
     * @param CardBalance
     */
    @Override
    public void WithdrawalAmount(double CardBalance) {
        System.out.println("Your current consumption: $" + CardBalance);
        System.out.println("Price after the discount: $" + CardBalance * 0.8);
        if (getCardBalance() < CardBalance * 0.8) {
            System.out.println("Sorry, your balance is not enough. your current amount is: $" + getCardBalance());
            return;
        }
        //update gold card balance
        setCardBalance(getCardBalance() - CardBalance * 0.8);
        System.out.println("Your current balance is: $" + getCardBalance());

        //If the consumption is greater than 200, give a car wash coupon.
        if (CardBalance * 0.8 >= 200) {
            printWashCoup();
        } else {
            System.out.println("Sorry, Your consumption is less than 200, so you cannot get a car wash coupon.");
        }
    }

    //print wash coupon
    public void printWashCoup() {
        System.out.println("you have got a car wash coupon");
    }


}
