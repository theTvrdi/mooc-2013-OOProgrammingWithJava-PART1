
public class Bird {

    private String name;
    private String latin;
    private int observation;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observation = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getLatin() {
        return this.latin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    public void increaseObservation() {
        this.observation++;
    }

    @Override
    public String toString() {
        return name + " (" + latin + "): " + observation + "observations";
    }
}
