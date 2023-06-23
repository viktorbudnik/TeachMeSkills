package homework8_2.task2;

public abstract class Employee implements EmployeePos{
    private String position;


    public Employee(String position)
    {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

}