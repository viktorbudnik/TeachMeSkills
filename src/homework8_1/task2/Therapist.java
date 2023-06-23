package homework8_1.task2;

public class Therapist extends Staff {
    public Therapist(String title){
        super(title);
    }

    @Override
    public String treatment() {
        return "Therapist ";
    }
}

