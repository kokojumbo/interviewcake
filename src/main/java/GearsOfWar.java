import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Marcin Gumkowski on 2016-09-12.
 */
public class GearsOfWar {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
        }
        for (Integer val : list) {
            if (val % 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
