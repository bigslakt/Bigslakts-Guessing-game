public class GuessingGame {

    public static void main(String[] args) {

        int low;
        int high;

        if(args.length > 1) {

            low = Integer.parseInt(args[0]);
            high = Integer.parseInt(args[1]);

            System.out.println("Users interval:");
        }
        else
        {
            low = 0;
            high = 1000;

            System.out.println("Correct user arguments missing...");
            System.out.println("Auto-generated interval:");
        }

        System.out.println(low + " " + high);
        System.out.println();

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
            guesser.start();
        }

    }
}
