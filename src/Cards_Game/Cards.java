package Cards_Game;

public class Cards {
    final String suit;
    final String  rank;

    Cards(String suit, String rank){
        this.rank = rank;
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public String toString(){
        return String.format("%s of %s",rank, suit);
    }
}
