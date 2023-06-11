package homework7.task1;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("123HJ568",769);
        System.out.println(creditCard1.getCCInfo());

        CreditCard creditCard2 = new CreditCard("574PO5163",24);
        System.out.println(creditCard2.getCCInfo());

        CreditCard creditCard3 = new CreditCard("958LD651",1590);
        System.out.println(creditCard3.getCCInfo());
        creditCard1.addMoney();
        creditCard2.addMoney();
        creditCard3.withdraw();
        System.out.println();
        System.out.println(creditCard1.getCCInfo());
        System.out.println(creditCard2.getCCInfo());
        System.out.println(creditCard3.getCCInfo());
    }

}

