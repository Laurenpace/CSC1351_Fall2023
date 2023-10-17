package CSC1351_Fall2023.Sorting;
import java.io.*;
import java.util.*;
public class ExchangeSortCode {
        static void exchangeSort(int[] num, int size)
        {
            int i, j, temp;
            for (i = 0; i < size - 1; i++)
            {
                for (j = i + 1; j < size; j++)
                {
                    if (num[i] > num[j])
                    {
                        // Swapping
                        temp = num[i];
                        num[i] = num[j];
                        num[j] = temp;
                    }
                }
            }
        }

        public static void main(String[] args)
        {
            int[] arr = { 5, 1, 4, 2, 8 };

            // Function call
            exchangeSort(arr, 5);
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }
//code: https://www.geeksforgeeks.org/introduction-to-exchange-sort-algorithm/


