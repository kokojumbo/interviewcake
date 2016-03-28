/**
 * Created by Marcin Gumkowski on 2016-03-28.
 */
public class SingleRifleCheck36 {



    /*
    I suspect the online poker game I'm playing shuffles cards by doing a single " riffle ↴
A "riffle" is the standard way people shuffle cards by hand. You know, the thing that looks like this:


Here's a rigorous definition of the riffle algorithm:

cut the deck into halves half1 and half2
grab a random number of cards from the top of half1 (could be 0, must be less than or equal to the number of cards left in half1) and throw them into the shuffledDeck
grab a random number of cards from the top of half2 (could be 0, must be less than or equal to the number of cards left in half2) and throw them into the shuffledDeck
repeat steps 2-3 until half1 and half2 are empty.
."

To prove this, let's write a function to tell us if a full deck of cards shuffledDeck is a single riffle of two other halves half1 and half2.

We'll represent a stack of cards as an array of integers in the range 1..521..52 (since there are 5252 distinct cards in a deck).
     */

    // O(n)
    //memory O(1) additional
    public boolean check(int[] half1, int[] half2, int[] shuffledDeck) {

        int idx1 = 0;
        int idx2 = 0;

        for (int i : shuffledDeck) {
            if (idx1 < half1.length && half1[idx1] == i) {
                idx1++;
                continue;
            }
            if (idx2 < half2.length && half2[idx2] == i) {
                idx2++;
                continue;
            }
            return false;

        }

        return true;
    }
}
