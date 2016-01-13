import java.util.Arrays;
import java.util.jar.Pack200;

/**
 * Created by kmg on 2016-01-12.
 */
public class FindRotationPoint13 {

    /**
     * Write a function for finding the index of the "rotation point," which is where I started working from the beginning of the dictionary. This array is huge (there are lots of words I don't know) so we want to be efficient here.
     * //
     * //    final String firstWord = words[0];
     * //
     * //    int floorIndex = 0;
     * //    int ceilingIndex = words.length - 1;
     * //
     * //    while (floorIndex < ceilingIndex) {
     * //
     * //        // guess a point halfway between floor and ceiling
     * //        int guessIndex = floorIndex + ((ceilingIndex - floorIndex) / 2);
     * //
     * //        // if guess comes before first word
     * //        if (words[guessIndex].compareTo(firstWord) > 0) {
     * //            // go right
     * //            floorIndex = guessIndex;
     * //        } else {
     * //            // go left
     * //            ceilingIndex = guessIndex;
     * //        }
     * //
     * //        // if floor and ceiling have converged
     * //        if (floorIndex + 1 == ceilingIndex) {
     * //            // between floor and ceiling is where we flipped to the beginning
     * //            // so ceiling is alphabetically first
     * //            break;
     * //        }
     * //    }
     * //    System.out.println(ceilingIndex);
     */
    static String[] words = new String[]{

            "retrograde",
            "supplant",
            "undulate",
            "xenoepist",
            "asymptote", // <-- rotates here!
            "babka",
            "banoffee",
            "engender",
            "karpatka",
            "othellolagkage",
            "ptolemaic",
    };

    public static void main(String[] args) {

        String firstWord = words[0];
        int leftIdx = 0;
        int rightIdx = words.length - 1;

        while (true) {
            int middleIdx = ((rightIdx - leftIdx) / 2) + leftIdx;
            if (words[middleIdx].compareTo(firstWord) > 0) {
                leftIdx = middleIdx;
            } else {
                rightIdx = middleIdx;
            }

            if (rightIdx == leftIdx + 1) {
                System.out.println(middleIdx);
                break;
            }


        }


    }


}
