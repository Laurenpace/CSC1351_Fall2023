package CSC1351_Fall2023.Sorting;

import java.util.Arrays;

public class MergeSortCode {
    public static void main(String[] args) {
        int[] arr = {11, 4, 7, 9, 2, 6, 3};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void merge(int[] array, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                array[k] = l[i];
                i++;
            }
            else {
                array[k] = r[j];
                j++;
            }
            k++;
        }

        while (i < left)
            array[k++] = l[i++];

        while (j < right)
            array[k++] = r[j++];

    }

    public static void mergeSort(int[] array) {

        if (array.length < 2)
            return;

        int mid = array.length / 2;
        int[] l = new int[mid];
        int[] r = new int[array.length - mid];

        for (int i = 0; i < mid; i++)
            l[i] = array[i];

        for (int i = mid; i < array.length; i++)
            r[i - mid] = array[i];

        mergeSort(l);
        mergeSort(r);

        merge(array, l, r, mid, array.length - mid);
    }

}
