import java.util.Arrays;

/**
 * Created by Marcin Gumkowski on 2016-11-03.
 */
public class Ocado {


    public static void main(String[] args) {


        int start = 1;
        for (int i = 0; i < 10; i++) {

            System.out.println(i + " " + solution(i));
        }

    }


    public static int solution(int Q) {
        if (Q == 0)
            return 1;
        int result = 0;
        int max = (int) Math.sqrt(Q);
        int i = 0;
        while (i * i <= max * max) {

            if (i * i + max * max == Q) {
                if (i == 0 || i == max) {
                    return 4;
                }
                if (i != max) {
                    return 8;
                }
            }
            i++;
        }
        return result;
    }


    public static int solution3(int Q) {
        if (Q == 0)
            return 1;

        int result = 0;
        int max = (int) Math.sqrt(Q);

        for (int i = -max; i <= max; i++) {
            for (int j = -max; j <= max; j++) {
                System.out.println("i: " + i);
                System.out.println("j: " + j);
                if ((i * i) + (j * j) == Q) {
                    result++;
                }
            }
        }


        return result;
    }

    public static int solution2(int A, int B) {
        // write your code in Java SE 8
        int counter = 0;
        for (int i = A; i <= B; i++) {

            if (isPrime(i)) {
                System.out.println(i);
                counter++;
            }

        }
        return counter;
    }


    private static boolean isPrime(int n) {
        if (n == 1)
            return false;
        if (n == 2)
            return true;
        if (n == 3)
            return true;
        if (n % 2 == 0)
            return false;
        if (n % 3 == 0)
            return false;

        int i = 5;
        int w = 2;

        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i += w;
            w = 6 - w;
        }
        return true;
    }

    public int solution1(int[] A) {
        // write your code in Java SE 8

        //sort
        Arrays.sort(A);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < A.length; i++) {
            int diff = A[i] - A[i - 1];
            if (diff < min) {
                min = diff;
            }
        }
        return min;


        //check distance
    }
}
