import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Marcin Gumkowski on 2016-10-16.
 */
public class AmazonTest {


    public static void main(String[] args) {


        List<Integer> result = getAnagramIndices("Abdcghbaabcdij", "bcda");
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }


    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static int findMinNumSteps(int[][] maze, int rows, int columns, int exitRow, int exitCol) {
        // WRITE YOUR CODE HERE
        LinkedList queue = new LinkedList();
        queue.add(new Point(0, 0));
        int steps = 0;
        while (!queue.isEmpty()) {
            Point point = (Point) queue.poll();
            if (maze[point.x][point.y] == 0) {
                steps++;
                if (point.x == exitRow && point.y == exitCol) {
                    return steps;
                } else {
                    // add all possible moves
                    queue.add(new Point(point.x + 1, point.y));
                    queue.add(new Point(point.x - 1, point.y));
                    queue.add(new Point(point.x, point.y + 1));
                    queue.add(new Point(point.x, point.y - 1));
                }
            }
        }
        return -1;

    }
    // METHOD SIGNATURE ENDS

    public static List<Integer> getAnagramIndices(String haystack, String needle) {
        // WRITE YOUR CODE HERE

        int n = haystack.length();
        int m = needle.length();
        if (n < m | m == 0 | n == 0) {
            return null;
        }

        int haystackHist[] = new int[256];
        int needleHist[] = new int[256];

        int i = 0;
        for (i = 0; i < m; i++) {
            needleHist[needle.charAt(i)]++;
            haystackHist[haystack.charAt(i)]++;
        }
        List<Integer> result = new ArrayList<Integer>();
        do {
            if (isAnagram(haystackHist, needleHist)) {
                //add to list
                result.add(i - m);
            }
            haystackHist[haystack.charAt(i)]++;
            haystackHist[haystack.charAt(i - m)]--;
        } while (++i < n);

        if (result.isEmpty())
            return null;
        return result;

    }

    public static boolean isAnagram(int[] hist1, int[] hist2) {
        for (int i = 0; i < hist1.length; i++) {
            if (hist1[i] != hist2[i]) {
                return false;
            }
        }
        return true;

    }

    static class Point {
        public int x;
        public int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
