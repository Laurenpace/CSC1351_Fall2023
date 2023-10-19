package CSC1351_Fall2023.Searching;

public class LinearSearchCode {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(LinearSearch(arr, 3));
    }
    public static int LinearSearch(int[] values, int searchVal) {
        int pos = -1; //returns -1 if not found
        for (int i = 0; i < values.length; i++) {
            if (values[i] == searchVal) {
                pos = i;
            }
        }
        return pos;
    }

}
