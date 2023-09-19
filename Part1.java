package JavaProject2;

public class Part1 {
    //Write a program to swap 2 String without a temporary variable?
    public static void main(String[] args) {
        String a = "hello";
        String b = "world";
        System.out.println("before swap:" + a + " " + b);
        // Concatenate the two strings

        a = a + b;
        // Extract the substrings of the concatenated string
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("after swap:" + a + " " + b);
        System.out.println("================================================================");

    }

}
