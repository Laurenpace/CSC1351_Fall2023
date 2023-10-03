package CSC1351_Fall2023.Recursion;

public class fibIterative {
    public static void main(String[] args) {
        System.out.println(iterativeFib(6));
    }
    public static long iterativeFib(int n) {

        if (n <= 2)
            return 1;

        else {
            long olderValue = 1;
            long oldValue = 1;
            long newValue = 1;

            for (int i = 3; i <= n; i++) {
                newValue = oldValue + olderValue;
                olderValue = oldValue;
                oldValue = newValue;
            }

            return newValue;
        }

    }

}
