public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient("Михаил", "Милонов", "Муж");
        Doctor doctor = new Doctor("Иван", "Майоров", "Муж");
        Medication medication = new Medication("Ангина", "Йокс, Азитромицин");
        MedCard medCard = new MedCard(patient, doctor, medication);
        System.out.println(medCard);
    }
}