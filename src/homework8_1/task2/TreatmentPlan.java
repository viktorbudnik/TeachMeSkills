package homework8_1.task2;


public class TreatmentPlan {
    private int treatCode;
    private Staff staff;


    public TreatmentPlan(int PlanNumber) {
        this.treatCode = PlanNumber;
        setClinicStaff();
    }

    public int getTreatCode() {
        return treatCode;
    }

    public Staff getClinicStaff() {
        return staff;
    }

    public void setClinicStaff() {

        if (treatCode == 1) {
            staff = new Surgeon("Surgeon") {
            };
        } else if (treatCode == 2) {
            staff = new Dentist("Dentist") {
            };
        } else {
            staff = new Therapist("Therapist") {
            };
        }
    }

    @Override
    public String toString() {
        return "Treatment plan: " +
                "\n  code: " + treatCode +
                ", \n  Doctor: " + staff+".";
    }
}



