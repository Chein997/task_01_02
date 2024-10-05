public class Patient extends Human{
    public Patient (String name, String surname, String gender){
        super(name, surname, gender);
    }

    @Override
    public String get() {
        return "Мед карта пациента: " + getName() + ' ' + getSurname() + ", Пол: " + getGender();
    }
}
