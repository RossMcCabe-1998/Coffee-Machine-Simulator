package coffeetype;

/**
 * Abstract class representing a coffee type
 * holds common properties like name, brewTime and soundFile.
 * @author Ross.
 */
public abstract class Coffee {
    protected String name;
    protected int brewTime;
    protected String soundFile;

    public Coffee(String name, int brewTime, String soundFile){
        this.name = name;
        this.brewTime = brewTime;
        this.soundFile = soundFile;
    }

    public String getName(){
        String result = name;
        return result;
    }

    public int getBrewTime(){
        int result = brewTime;
        return result;
    }

    public String getSoundFile(){
        String result = soundFile;
        return result;
    }
}
