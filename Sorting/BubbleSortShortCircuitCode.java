package CSC1351_Fall2023.Sorting;

import java.util.Arrays;

public class BubbleSortShortCircuitCode {
        public static void main(String[] args) {
            int[] arr = {11, 4, 7, 9, 2, 6, 3};


            BubbleSortShortCircuit(arr);
            System.out.println(Arrays.toString(arr));
        }
        public static void BubbleSortShortCircuit(int[] array){
            boolean sorted = false;
            int i = 1;    //loop initialization
            int temp = 0;
            //loop condition
            while (!sorted) {
                if (i == array.length) {
                    sorted = true;
                }
                else {
                    sorted = true;
                    for(int j = 0; j < array.length-i; j++){
                        if(array[j] > array[j+1]) {
                            temp = array[j];
                            array[j] = array[j+1];
                            array[j+1] = temp;
                            sorted = false;
                        }

                    }
                }
                i++; //loop update
            }
        }
    }

