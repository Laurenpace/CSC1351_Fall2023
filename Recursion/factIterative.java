package CSC1351_Fall2023.Recursion;

public class factIterative {
    public static void main(String[] args) {
        System.out.println(factIter(5));
    }
    public static int factIter(int n){
        int product = 1;
        for (int i = n; i > 0; i--){
            product = product * i;
        }
        return product;
    }
}
