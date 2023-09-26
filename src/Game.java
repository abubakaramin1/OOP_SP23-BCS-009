public class Game {

    Cards Player1[] = new Cards[13];
    Cards Player2[] = new Cards[13];
    Cards Player3[] = new Cards[13];
    Cards Player4[] = new Cards[13];
    public void distribution(Deck d){
        int counter1=0;
        int counter2=0;
        int counter3=0;
        int counter4=0;

        for(int i = 0; i < 52; i++){
            if(i%4==0){
                Player1[counter1++] = d.deck[i];
            }
            if(i%4==1){
                Player2[counter2++] = d.deck[i];
            }
            if(i%4==2){
                Player3[counter3++] = d.deck[i];
            }
            if(i%4==3){
                Player4[counter4++] = d.deck[i];
            }
        }

    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < 13; i++){
            str.append(Player1[i] + "\n");
        }
        return str.toString();
    }

}


