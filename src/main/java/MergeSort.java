/**
 * Created by Marcin Gumkowski on 2016-12-03.
 */
public class MergeSort {

    public static void main(String[] args) {


        int[] mat = {2, 1, 3, 4, 7, 32, 3, 4};
        int[] x = mergesort(mat, 0, mat.length - 1);
        for (int i : x) {
            System.out.println(i);
        }
    }


    public static int[] mergesort(int[] tab, int low, int end) {
        if (low < end) {
            int mid = (low + end) / 2;
            mergesort(tab, low, mid);
            mergesort(tab, mid + 1, end);
            merge(tab, low, mid, end);
        }
        return tab;

    }

    private static void merge(int[] tab, int low, int mid, int end) {
        int[] temp = new int[tab.length];
        for (int l = low; l <= end; l++) {
            temp[l] = tab[l];
        }
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= end) {
            if (tab[i] <= tab[j]) {
                temp[k] = tab[i];
                i++;
            } else {
                temp[k] = tab[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = tab[i];
            i++;
            k++;
        }

        for (int l = low; l <= end; l++) {
            tab[l] = temp[l];
        }
    }
}
