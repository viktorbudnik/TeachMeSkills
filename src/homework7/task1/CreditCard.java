package homework7.task1;

import java.util.Scanner;


public class CreditCard {
    private String cardNumber;
    private double cardBalance;

    public CreditCard(String cardNumber, double cardBalance) {
        this.cardNumber = cardNumber;
        this.cardBalance = cardBalance;
    }

    public void addMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add sum for card " + cardNumber + ":");
        double num = scanner.nextDouble();
        this.cardBalance += num;
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Withdrew sum from card " + cardNumber + ":");
        double num = scanner.nextDouble();
        {
            if (num <= this.cardBalance) {
                this.cardBalance -= num;
            } else {
                System.out.println("You cannot withdraw " + num + ", " +
                        "because you don't have enough money. Your balance is: " + this.cardBalance);
            }
        }
    }

    public String getCCInfo() {
        return "Credit card number is: " + this.cardNumber + "\n" +
                "Card balance is: " + this.cardBalance + "\n";
    }
}


