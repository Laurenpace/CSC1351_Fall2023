package CSC1351_Fall2023.Recursion;

public class factRecur {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        //returns 0 if the number becomes larger than an integer can store
    }
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else return n * factorial(n -1);
    }
}
