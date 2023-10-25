public class Player {

    private String name;
    private int score;
    private int consecutiveWins;
    private boolean out = false;

    public Player(String name) {
        this.name = name;
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public boolean getOut(){
        return out;
    }
    public int getConsecutiveWins() {
        return consecutiveWins;
    }

    public void isOut(){
        consecutiveWins = 0;
        out = true;
    }

    public void incrementScore() {
        score++;
    }

    public void reset() {
        score = 0;
        out = false;
    }
}