package homework7.task2;

public class Computer {
    private double price;
    private String model;
    private RAM ram;
    private HDD hdd;

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer(double price, String model, HDD hdd, RAM ram) {
        this.price = price;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String toString() {

        return "Price PC: " + getPrice() + " " + "Model PC: " + getModel() + this.hdd + this.ram;
    }

}
