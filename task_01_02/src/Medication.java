public class Medication extends Ilness {

    public Medication(String nameIl, String pills){
        super(nameIl, pills);
    }

    @Override
    public String get(){
        return "\nБолезнь: " + getNameIl() +"\n" + "Лекарства: " + getPills();
    }

}