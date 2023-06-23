package homework8_2.task2;

public class Worker extends Employee{
    public Worker(String position) {
        super(position);
    }

    @Override
    public void position() {
        System.out.println(super.getPosition());
    }
}
