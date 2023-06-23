package homework8_2.task2;

public class MainOffice {
    public static void main(String[] args) {
        Employee director = new Director("Director");
        System.out.println("This employee is: ");
        director.position();

        Employee accountant = new Accountant("Accountant");
        System.out.println("This employee is: ");
        accountant.position();

        Employee worker = new Worker("Worker");
        System.out.println("This employee is: ");
        worker.position();
    }
}
