

public class Player {
    private String playerName;
    private int goalsAmount;
    
    public Player(String playerName){
        this.playerName=playerName;
        this.goalsAmount=0;
    }
    
    public Player(String playerName, int goalsAmount){
        this.playerName=playerName;
        this.goalsAmount=goalsAmount;
    }
    
    public String getName(){
        return this.playerName;
    }
    
    public int goals(){
        return this.goalsAmount;
    }
    
    public String toString(){
        return ("Player: "+this.playerName+",goals "+this.goalsAmount);
    }
}


//getName, returns the player name
//goals, returns the amount of goals
//toString, returns a string representation that is formed as in the example below//