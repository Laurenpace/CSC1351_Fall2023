package CSC1351_Fall2023.Searching;

public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(binarySearch(arr, 3));
    };
    public static int binarySearch(int[] a, int target){

        int min = 0;
        int max = a.length - 1;
        int retVal = -1;
        int count = 0;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (target > a[mid]) {
                min = mid + 1;
            }

            else if (target < a[mid]) {
                max = mid - 1;
            }

            else {
                retVal = mid;   // target found
                break;
            }
        }
        return retVal;
    }

}
