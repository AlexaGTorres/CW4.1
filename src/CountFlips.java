public class CountFlips
{
    //----------------------------------------------
    //Flips a coin multiple times and counts the number of heads and tails that result.
    //----------------------------------------------
    public static void main (String[]args)
    {
        System.out.println ("Alexa Torres, Classwork 4.1");

        final int NUM_FLIPS = 1000;
        int heads = 0, tails = 0;

        Coin myCoin = new Coin(); //Instantiate the Coin object

        for (int count = 1; count <= NUM_FLIPS; count++)
        {
            myCoin.flip();

            if (myCoin.isHeads())
            {
                heads++;
            }//If heads
            else
            {
                tails++;
            }//If tails
        }//For loop
        System.out.println ("The number of flips: " + NUM_FLIPS);
        System.out.println ("The number of heads: " + heads);
        System.out.println ("The number of tails: " + tails);
    }//Main method
}//End class CountFlips
