package src.main.java.com.lg.oop.GasStationPaymentTest;

/**
 * TODO：silver card
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage src.main.java.com.lg.oop
 * @since 2026-06-04  16:00
 */
public class SilverCard extends CardInformation {
    public SilverCard(int licensePlates, String name, String telephoneNumber, double CardBalance) {
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
     * @param CardBalance
     */
    @Override
    public void WithdrawalAmount(double CardBalance) {
        System.out.println("Your current consumption: $" + CardBalance);
        System.out.println("Price after the discount: $" + CardBalance * 0.9);
        if (getCardBalance() < CardBalance * 0.9) {
            System.out.println("Sorry, your balance is not enough. your current amount is: $" + getCardBalance());
            return;
        }
        //update silver card balance
        setCardBalance(getCardBalance() - CardBalance * 0.9);
        System.out.println("Your current balance is: $" + getCardBalance());
    }
}
