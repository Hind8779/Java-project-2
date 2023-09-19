package JavaProject2;
// Find the First Non-Repeating Character in a String: Given a string,
//find and return the first non-repeating character. For example, in the
//string "abracadabra", the first non-repeating character is 'c'

public class FirstNonRepeatingCharacter {
    public static char findFirstNonRepeatingChar(String str) {
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isRepeating = false;
            // Compare the current character with the rest of the string
            for (int j = 0; j < str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }
            // If the character is not repeating, return it
            if (!isRepeating) {
                return currentChar;
            }
        }
        // If no non-repeating character is found, return a default value
        return '\0';
    }
    public static void main(String[] args) {
        String str = "abracadabra";
        char firstNonRepeatingChar = findFirstNonRepeatingChar(str);
        System.out.println("First non-repeating character: " + firstNonRepeatingChar);
    }
}



