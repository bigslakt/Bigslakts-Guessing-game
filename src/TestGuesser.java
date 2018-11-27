import java.util.Objects;

public class TestGuesser {

    public static void main(String[] args) {

        Guesser guesser1 = createGuesser(0, 1000);
        if(Objects.equals(guesser1.toString(), "Low: 0 High: 1000"))
        {
            System.out.println("Test 1 passed");
        }
        else
        {
            System.out.println("Test 1 failed");
        }
        System.out.println("Guesser1: \n" + guesser1);
        System.out.println();

        Guesser guesser2 = createGuesser(1000, 0);
        if(Objects.equals(guesser2, "Low: 1000 High: 0"))
        {
            System.out.println("Test 2 passed");
        }
        else
        {
            System.out.println("Test 2 failed");
        }
        System.out.println("Guesser2: \n" + guesser2);
        System.out.println();

        Guesser guesser3 = createGuesser(250, 650);
        if(Objects.equals(guesser3.toString(), "Low: 250 High: 650"))
        {
            System.out.println("Test 3 passed");
        }
        else
        {
            System.out.println("Test 3 failed");
        }
        System.out.println("Guesser3: \n" + guesser3);
        System.out.println();

    }

    private static Guesser createGuesser(int low, int high)
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
