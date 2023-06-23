package homework8_1.task1;

import java.util.Arrays;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        System.out.println("3");
    }

    public Phone(int number, String model) {
        this(number, model, 0);
        System.out.println("2");
    }

    public Phone() {
        System.out.println("0");
    }

    public String receiveCall(String callerName) {
        return "Call " + callerName;
    }

    public String receiveCall(String callerName, int number) {
        return "Call: " + callerName + "\nNumber: " + number;
    }

    public int getNumber() {
        return number;
    }

    public String getPhoneInfo() {

        return "Phone model: " + model + "\n" +
                "Phone number: " + number + "\n" +
                "Phone weight: " + weight + "\n";
    }

    public String sendMessage(int ...numbers){
        return "The message sent from number " +this.number+ " to numbers: " + Arrays.toString(numbers);
    }
}

