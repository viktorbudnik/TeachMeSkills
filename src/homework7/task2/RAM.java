package homework7.task2;

public class RAM {
    private String name;
    private double size;
    public RAM(){}
    public RAM(String name, double size)
    {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }
    public double getSize(){
        return size;
    }
    public String toString(){
        return "RAM model " + getName() + " "+ "RAM Size " + getSize()+"GB";
    }
}
