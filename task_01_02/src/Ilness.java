public abstract class Ilness extends MedCard {
    private String nameIl;
    private String pills;

    public Ilness(String nameIl, String pills){
        this.nameIl = nameIl;
        this.pills = pills;
    }

    public String getNameIl(){
        return nameIl;
    }

    public String getPills(){
        return pills;
    }


}