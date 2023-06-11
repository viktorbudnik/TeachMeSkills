package homework7.task2;

public class HDD {
    private String name;
    private double size;
    private String type;
    public HDD() {
    }

    public HDD(String name, double size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "HDD model " + getName() + " " + "HDD Size " + getSize() + "TB " + "HDD Type " + getType()+" ";
    }
}
