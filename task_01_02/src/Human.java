public abstract class Human extends MedCard {
    private String name;
    private String surname;
    private String gender;
    public Human(String name, String surname, String gender){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getGender(){
        return gender;
    }

}