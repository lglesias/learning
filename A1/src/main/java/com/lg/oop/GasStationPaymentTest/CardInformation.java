package src.main.java.com.lg.oop.GasStationPaymentTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO：  CardInformation
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage src.main.java.com.lg.oop
 * @since 2026-06-04  15:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardInformation {
    //license Plates
    private int licensePlates;
    //name
    private String name;
    //telephone Number
    private String telephoneNumber;
    //Card Balance
    private double CardBalance;

    //Deposit amount
    public void DepositAmount(double CardBalance){
        this.CardBalance += CardBalance;
    }
    //Withdrawal amount
    public void WithdrawalAmount(double CardBalance){
        this.CardBalance -= CardBalance;
    }
}
