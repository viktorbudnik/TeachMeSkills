package homework8_2.task2;

public class Director extends Employee {
    public Director(String position) {
        super(position);
    }

    @Override
    public void position() {
        System.out.println(super.getPosition());
    }
}