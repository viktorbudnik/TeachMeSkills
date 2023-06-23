package homework8_1.task2;

public class Dentist extends Staff {
    public Dentist(String title) {
        super(title);
    }

    @Override
    public String treatment() {
        return "Dentist ";
    }
}


