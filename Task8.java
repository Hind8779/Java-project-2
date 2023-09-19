package JavaProject2;
//Write a Java Function that increments a string,
//It should take the string of unknown length. Don't use regular
//expressions.
//Examples:
//123 -> 124
//53456 -> 53457
//29 -> 30
//Function signature:
//string Increment (string str)

public class Task8 {
    public static String increment(String str) {

// Convert the input string to an integer
        int number = Integer.parseInt(str);

        // Increment the integer value
        number++;

        // Convert the incremented integer back to a string
        return String.valueOf(number);
    }

    public static void main(String[] args) {
        String input1 = "123";
        String input2 = "53456";
        String input3 = "29";

        String result1 = increment(input1);
        String result2 = increment(input2);
        String result3 = increment(input3);

        System.out.println("Input: " + input1 + " -> Output: " + result1);
        System.out.println("Input: " + input2 + " -> Output: " + result2);
        System.out.println("Input: " + input3 + " -> Output: " + result3);
    }
}




