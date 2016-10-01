import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Marcin Gumkowski on 2016-09-01.
 */
public class ClosestNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
        }


        Collections.sort(list);
        Integer minDiff = Integer.MAX_VALUE;
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < list.size() - 1; i++) {
            Integer next = list.get(i + 1);
            Integer cur = list.get(i);
            Integer tempDiff = Math.abs(cur - next);
            if (tempDiff < minDiff) {
                minDiff = tempDiff;
                result = new ArrayList<String>();
                result.add(cur.toString());
                result.add(next.toString());
            } else if (tempDiff.equals(minDiff)) {
                result.add(cur.toString());
                result.add(next.toString());
            }

        }

        System.out.println(String.join(" ", result));
    }

}
