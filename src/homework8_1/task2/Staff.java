package homework8_1.task2;

public abstract class Staff {
    private String title;
    public Staff(String title){
        this.title=title;
    }
    public abstract String treatment();

    @Override
    public String toString() {
        return title;
    }
}
