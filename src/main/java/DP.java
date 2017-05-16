import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcin Gumkowski on 2016-12-07.
 */
public class DP {
    public static void main(String[] args) {

        List<Integer> values = new ArrayList<Integer>();
        values.add(1);
        values.add(3);
        values.add(5);
        System.out.println(novice(values, 11));

    }


    public static int novice(List<Integer> values, int sum) {
        int[] solutions = new int[sum + 1];
        for (int i = 0; i < solutions.length; i++) {
            solutions[i] = Integer.MAX_VALUE;
        }
        solutions[0] = 0;

        for (int i = 1; i < solutions.length; i++) {


            for (Integer value : values) {
                if (value <= i && solutions[i - value] + 1 < solutions[i])
                    solutions[i] = solutions[i - value] + 1;
            }
        }
        return solutions[sum];


    }
}
