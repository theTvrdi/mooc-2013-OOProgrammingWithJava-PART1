public class Reformatory {

    private int i;
    public int weight(Person person) {
        this.i++;
        return person.getWeight();
    }
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
    public int totalWeightsMeasured(){
        return this.i;
    }
}
