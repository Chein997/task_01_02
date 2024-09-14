public class MedCard {
    private Patient patient;
    private Doctor doctor;
    private Medication medication;

    public MedCard(Patient patient, Doctor doctor, Medication medication){
        this.doctor = doctor;
        this.patient = patient;
        this.medication = medication;
    }

    public Patient getPatient(){
        return patient;
    }

    public Doctor getDoctor(){
        return doctor;
    }

    public Medication getMedication(){
        return medication;
    }

    @Override
    public String toString(){
        return "Мед карта " + getPatient() + "\n" + getDoctor() + "\n" + getMedication();
    }
}
