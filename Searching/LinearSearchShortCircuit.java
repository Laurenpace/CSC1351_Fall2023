package CSC1351_Fall2023.Searching;

public class LinearSearchShortCircuit {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(LinearSearch(arr, 3));
    }
    public static int LinearSearch(int[] values, int searchVal) {
        int pos = -1;
        int i = 0;
        boolean finishedSearch = false;
        while (!finishedSearch){
            if (i == values.length) {
                finishedSearch = true;
            }
            else if (values[i] == searchVal) {
                pos = i;
                finishedSearch = true;
            }
            i++;
        }
        return pos;    }


}
