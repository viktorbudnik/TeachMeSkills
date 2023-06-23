package homework8_1.task2;

public class MainClinic {
    public static void main(String[] args) {
        Patient patient=new Patient("David", "Beckham",48);
        Patient patient1=new Patient("Jennifer","Lopez", 53);
        Patient patient2=new Patient("Elon","Musk",51);
        patient.setTreatmentPlan(new TreatmentPlan(1));
        patient1.setTreatmentPlan(new TreatmentPlan(3));
        patient2.setTreatmentPlan(new TreatmentPlan(2));
        System.out.println(patient);
        System.out.println(patient1);
        System.out.println(patient2);
    }
}
