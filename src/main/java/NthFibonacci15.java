/**
 * Created by kmg on 2016-02-10.
 */
public class NthFibonacci15 {

    /**
     *
     * Complexity
     O(n)O(n) time and O(1)O(1) space.



     *   public int fibIterative(int n) {

     // edge cases:
     if (n < 0) {
     throw new IllegalArgumentException("Index was negative. No such thing as a negative index in a series.");
     } else if (n == 0 || n == 1) {
     return n;
     }

     int prev = 0;
     int prevPrev = 1;
     int current = 0;
     for (int x=0; x<n; x++) {
     current = prev + prevPrev;
     prevPrev = prev;
     prev = current;
     }

     return current;
     }
     */

    //My solution is iterative or count a fib element based on the binets formula
}
