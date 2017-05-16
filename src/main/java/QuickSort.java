/**
 * Created by Marcin Gumkowski on 2016-12-03.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] mat = {2, 1, 3, 4, 7, 32, 3, 4};
        int[] result = quicksort(mat, 0, mat.length - 1);
        for (int i : result) {
            System.out.println(i);
        }
    }


    public static int[] quicksort(int[] tab, int low, int high) {
        if (low < high) {
            int p = partition(tab, low, high);
            quicksort(tab, low, p - 1);
            quicksort(tab, p + 1, high);
        }
        return tab;
    }

    private static int partition(int[] tab, int low, int high) {
        int pivot = tab[high];
        int i = low;
        for (int j = low; j <= high - 1; j++) {
            if (tab[j] <= pivot) {
                swap(tab, i, j);
                i++;
            }
        }
        swap(tab, i, high);
        return i;
    }

    private static void swap(int[] tab, int i1, int i2) {
        int temp = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = temp;
    }
}
