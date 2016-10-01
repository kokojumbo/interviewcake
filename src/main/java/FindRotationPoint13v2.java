import java.util.Arrays;

/**
 * Created by Marcin Gumkowski on 2016-08-26.
 */
public class FindRotationPoint13v2 {


    public static int findRotPoint(String[] dict, int firstIdx, int lastIdx) {


        //if (dict.length < 2) return dict.length;
        int first = dict[firstIdx].charAt(0);
        int last = dict[lastIdx].charAt(0);
        int idx = ((lastIdx + firstIdx) / 2);
        if (checkIfZA(dict[idx], dict[idx + 1])) {
            return idx;
        } else {
            int temp = dict[idx].charAt(0);
            if (temp > first)
                return findRotPoint(dict, idx, lastIdx);

            if (temp < last)
                return findRotPoint(dict, firstIdx, idx);

            return -1;
        }


    }


    public static boolean checkIfZA(String word1, String word2) {
        if (word1.charAt(0) > word2.charAt(0)) {
            return true;
        }
        return false;


    }


    public static void main(String[] args) {
        System.out.println('a' > 'b');
        System.out.println('a' == 'b');
        System.out.println('a' < 'b');
        int i = "abc".charAt(2);
        System.out.println(i);


        String[] words = new String[]{

                "othellolagkage",
                "ptolemaic",
                "retrograde",
                "supplant",
                "undulate",
                "xenoepist",
                "asymptote", // <-- rotates here!
                "babka",
                "banoffee",
                "engender",
                "karpatka",


        };

        System.out.println(findRotPoint(words, 0, words.length - 1));

    }

}
