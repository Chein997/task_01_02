public class Medication extends Ilness {

    public Medication(String nameIl, String pills){
        super(nameIl, pills);
    }

    @Override
    public String toString(){
        return "Болезнь: " + getNameIl() +"\n" + "Лекарства: " + getPills();
    }

}
