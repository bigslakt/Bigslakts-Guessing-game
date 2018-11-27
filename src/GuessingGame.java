public class GuessingGame {

    public static void main(String[] args) {

        Guesser guesser = null;

        try {
            guesser = new Guesser(0, 1000);
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }

        if(guesser != null)
        {
            guesser.start();
        }

    }
}
