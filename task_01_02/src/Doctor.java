public class Doctor extends Human {

    public Doctor(String name, String surname, String gender) {
        super(name, surname, gender);
    }

    @Override
    public String toString() {
        return "Лечащий врач: " + getName() + ' ' + getSurname() + ", Пол: " + getGender();
    }
}
