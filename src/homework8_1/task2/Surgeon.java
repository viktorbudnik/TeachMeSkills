package homework8_1.task2;

public class Surgeon extends Staff {
    public Surgeon(String title){
    super(title);
    }

    @Override
    public String treatment() {
        return "Surgeon ";
    }
}


