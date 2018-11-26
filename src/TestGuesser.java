public class TestGuesser {

    public static void main(String[] args) {

        Guesser guesser1 = createGuesser(0, 1000);
        System.out.println("Guesser1: \n" + guesser1);
        System.out.println();

        Guesser guesser2 = createGuesser(1000, 0);
        System.out.println("Guesser2: \n" + guesser2);
        System.out.println();

        Guesser guesser3 = createGuesser(250, 650);
        System.out.println("Guesser3: \n" + guesser3);
        System.out.println();

    }

    public static Guesser createGuesser(int low, int high)
    {
        Guesser guesser = null;

        try {
            guesser = new Guesser(low, high);
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }

        if(guesser != null)
        {
            return guesser;
        }

        return null;
    }
}
