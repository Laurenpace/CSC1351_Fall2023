package CSC1351_Fall2023.Sorting;

import java.util.Arrays;

public class SelectionSortCode {
    public static void main(String[] args) {
        int[] arr = {11, 4, 7, 9, 2, 6, 3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]< arr[minIndex]){
                    minIndex = j;
                }
            }

            int smallerNumber = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}
