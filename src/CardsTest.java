public class CardsTest {
    public static void main(String[] args) {

        Deck d1 = new Deck();
        Game g1 = new Game();

        // System.out.println(d1);
        System.out.println(d1.shuffle());
        System.out.println(d1);
        g1.distribution(d1);
        System.out.println("Cards of player 1");
        System.out.println(g1);
    }
}
