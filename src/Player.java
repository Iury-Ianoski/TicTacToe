public class Player {
    private String name;
    private char time;
    private boolean playsFirst;
    private int wins;

    public Player(String name, char time, boolean playsFirst, int wins) {
        this.name = name;
        this.time = time;
        this.playsFirst = playsFirst;
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getTime() {
        return time;
    }

    public void setTime(char time) {
        this.time = time;
    }

    public boolean isPlaysFirst() {
        return playsFirst;
    }

    public void setPlaysFirst(boolean playsFirst) {
        this.playsFirst = playsFirst;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
