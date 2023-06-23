package homework8_1.task2;

public class Patient {
    private String name;
    private String surname;
    private int age;
    private TreatmentPlan treatmentPlan;
    public Patient(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    @Override
    public String toString() {
        return "Patient: " + name+" " + surname +", age = " + age +
                "\n" + treatmentPlan;
    }
}
