package homework8_1;

public class MainPhone {
    public static void main(String[] args) {
        Phone phone1=new Phone(546235, "Nokia", 550);
        Phone phone2=new Phone(458621, "Motorola",250);
        Phone phone3=new Phone(235615,"Siemens");

        System.out.println(phone1.getPhoneInfo());
        System.out.println(phone2.getPhoneInfo());
        System.out.println(phone3.getPhoneInfo());

        System.out.println(phone1.receiveCall("Alex"));
        System.out.println(phone2.receiveCall("Jack", phone2.getNumber()));
        System.out.println("_______________________");
        System.out.println(phone1.sendMessage(264566,516544,544555));
        System.out.println(phone2.sendMessage(264566,516544,544555));


    }
}
