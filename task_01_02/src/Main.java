import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient("Михаил", "Милонов", "Муж");
        Doctor doctor = new Doctor("Иван", "Майоров", "Муж");
        Medication medication = new Medication("Ангина", "Йокс, Азитромицин");

        ArrayList<MedCard> medCard = new ArrayList<>();
        medCard.add(patient);
        medCard.add(doctor);
        medCard.add(medication);
        for(MedCard card : medCard){
            System.out.print(card.get());
        }

    }
}