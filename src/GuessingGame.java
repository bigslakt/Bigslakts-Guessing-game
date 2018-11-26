public class GuessingGame {

    public static void main(String[] args) {

        try {
            Guesser guesser = new Guesser(0, 1000);
            System.out.println(guesser);
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }
    }
}
