import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Marcin Gumkowski on 2016-10-27.
 */
public class Solution {

    //complexity O(n), space O(n)
    public static int solution(int[] A) {
        Set<Integer> distinctSet = new HashSet<Integer>();
        for (int i : A) {
            distinctSet.add(i);
        }

        return distinctSet.size();
    }

    public static int solution1(int[] A) {
        if (A.length < 1) {
            return 0;
        }
        Arrays.sort(A);

        int counter = 1;

        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1]) {
                counter++;
            }

        }

        return counter;
    }

    public static void main(String[] args) {

        int[] a = new int[]{4, 3, 1, 2, 1, 1};

        System.out.println(solution1(a));

    }
}
