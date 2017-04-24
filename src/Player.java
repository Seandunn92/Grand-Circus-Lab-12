public abstract class Player {
    protected Roshambo roshValue;
    protected String name;

    abstract Roshambo generateRoshamboValue();

    public String getName(){
        return name;
    }



}
