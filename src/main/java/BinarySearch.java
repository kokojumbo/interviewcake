/**
 * Created by Marcin Gumkowski on 2016-12-03.
 */
public class BinarySearch {

    public static void main(String[] args) {

        int[] mat = {1, 4, 5, 7, 8, 10, 23, 456, 3444};
        for (int i : mat) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(binarysearchRec(mat, 3444, 0, mat.length - 1));
        System.out.println(binarysearchIter(mat, 7));

    }

    public static int binarysearchRec(int[] tab, int n, int low, int high) {
        if (low <= high) {

            int mid = (low + high) / 2;
            if (tab[mid] == n) {
                return mid;
            } else if (n < tab[mid]) {
                return binarysearchRec(tab, n, low, mid - 1);
            } else {
                return binarysearchRec(tab, n, mid + 1, high);
            }

        }
        return -1;//or throw error
    }


    public static int binarysearchIter(int[] tab, int n) {
        int low = 0;
        int high = tab.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (n == tab[mid]) {
                return mid;
            } else if (n < tab[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;//or throw error
    }

}


