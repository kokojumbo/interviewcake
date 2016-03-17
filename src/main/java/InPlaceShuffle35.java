import java.util.Random;

/**
 * Created by Marcin Gumkowski on 2016-03-17.
 */
public class InPlaceShuffle35 {


    public int getRandom(int floor, int ceiling) {
        Random rand = new Random();
        return rand.nextInt((ceiling - floor) + 1) + floor;
    }

    public void naiveShuffle(int[] theArray) {
        if (theArray.length <= 1) return;

        for (int i : theArray) {

            int newRand = getRandom(i, theArray.length);

            int temp = theArray[newRand];
            theArray[newRand] = theArray[i];
            theArray[i] = temp;


        }

    }


}
