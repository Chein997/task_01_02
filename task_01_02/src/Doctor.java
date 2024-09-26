public class Doctor extends Human {

    public Doctor(String name, String surname, String gender) {
        super(name, surname, gender);
    }

    @Override
    public String get() {
        return "\nЛечащий врач: " + getName() + ' ' + getSurname() + ", Пол: " + getGender();
    }
}