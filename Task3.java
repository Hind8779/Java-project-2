package JavaProject2;

public class Task3 {
    //3. Check if a String is Palindrome: Determine whether a given string is
    //a palindrome, which means it reads the same forwards and
    //backward. For example, "madam" is a palindrome.
    public static boolean isPalindrome(String s) {

        // Compare the original string with its reverse
        String reverse = new StringBuilder(s).reverse().toString();
        return s.equals(reverse);
    }

    public static void main(String[] args) {
        String inputString = "madam";
        if (isPalindrome(inputString)) {
            System.out.println("'" + inputString + "' is a palindrome.");
        } else {
            System.out.println("'" + inputString + "' is not a palindrome.");
        }
    }
}


