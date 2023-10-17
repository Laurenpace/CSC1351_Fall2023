package CSC1351_Fall2023.Sorting;

import java.util.Arrays;

public class QuickSortCode {
    public static void main(String[] args) {
        int[] arr =  new int[]{5, 4, 9, 3, 1, 7};
        System.out.println(Arrays.toString(arr));

        quicksort(arr, 0, arr.length-1);
         System.out.println(Arrays.toString(arr));
    }

    //Lomuto partition scheme implementation
    public static void quicksort(int[] arr, int low, int high) {
        if(low >= high || low < 0){// Ensure indices are in correct order
            return;
        }

        int p = partition(arr, low, high); //// Partition array and get the pivot index

        quicksort(arr, low, p - 1);//left side of pivot
        quicksort(arr, p + 1, high);//right side of pivot
    }

    // Divides array into two partitions
    private static int partition(int[] a, int low, int high) {
        int pivot = a[high]; //last element chosen as pivot
        int i = low - 1; //temporary pivot index

        for (int j = low; j <= high - 1; j++) {
            if (a[j] <= pivot) {// If the current element is less than or equal to the pivot
                i++; // Move the temporary pivot index forward
                // Swap the current element with the element at the temporary pivot index
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }

        // Move the pivot element to the correct pivot position (between the smaller and larger elements)
        i++;
        int temp = a[high];
        a[high] = a[i];
        a[i] = temp;
        return i;// the pivot index
    }
}





