
import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> lista = new ArrayList<Player>();
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player igrac) {
        if (size() < this.maxSize) {
            lista.add(igrac);
        }
    }

    public void printPlayers() {
        for (Player i : lista) {
            System.out.println(i.toString());
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return lista.size();
    }
    
    public int goals(){
        int temp = 0;
        for (Player i : lista) {
            temp+=i.goals();
        }
        return temp;
    }
}



/*setMaxSize(int maxSize), sets the maximum number of players that the team can have
size, returns the number of players in the team
By default the maximum number of players should be set to 16, 
and that can be changed with the method setMaxSize.
Change the method addPlayer so that it does not add players to the team if the team already 
has the maximum number of players.*/
