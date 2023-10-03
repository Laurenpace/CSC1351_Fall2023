package CSC1351_Fall2023.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("aAA sda".replaceAll("\\s+","").toLowerCase());
        System.out.println(isPalindrome("aBBa"));
        System.out.println(isPalindrome("abaBA"));
        System.out.println(isPalindrome("abaBAa"));
    }


    public static boolean isPalindrome(String input)
    {

        input = input.replaceAll("\\s+","").toLowerCase();

        if(input.length() <= 1 )
            return true;

        else if(input.charAt(0) == input.charAt(input.length()-1))
            return isPalindrome(input.substring(1, input.length()-1));

        else return false;
    }

}
