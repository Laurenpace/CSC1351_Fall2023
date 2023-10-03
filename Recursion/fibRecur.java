package CSC1351_Fall2023.Recursion;

public class fibRecur {

    public static void main(String[] args) {
        System.out.println(fib(136));
    }
    public static long fib(int n)
    {
        if (n <= 2)
            return 1;
        else
            return fib(n-1) + fib (n-2);
    }

}
