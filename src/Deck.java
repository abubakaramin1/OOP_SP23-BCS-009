import java.util.Arrays;
import java.util.Random;

public class Deck {
    Cards deck[] = new Cards[52];
    String suits[] = {"Hearts", "Clubs", "Diamonds", "Spades"};
    String ranks[] = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King"};
    int counter;
    Deck(){
        for(int i=0; i<4; i++){
            for(int j =0; j<13; j++){
                deck[counter++] = new Cards(suits[i], ranks[j]);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i<52 ; i++){
            str.append(deck[i] + "\n");
        }
        return str.toString();
    }

    public String shuffle(){
        Random rand = new Random();

        for (int i =0; i<50; i++) {
            int y = rand.nextInt(52);
            int x = rand.nextInt(52);

            Cards temp = deck[x];
            deck[x] = deck[y];
            deck[y] = temp;
        }
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i<52 ; i++){
            str2.append(deck[i] + "\n");
        }
        return str2.toString();
    }
}
