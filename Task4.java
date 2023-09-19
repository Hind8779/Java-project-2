package JavaProject2;

public class Task4 {
    //Count the Number of Words in a String: Write a function to count the
    //number of words in a given string. Words are separated by spaces or
    //punctuation. For example, the input "Hello, world!" should return 2.
    public static int count(String input){
        String [] words = input.split("\\s+|\\p{Punct}+");
        return words.length;

    }
    public static void main(String[] args) {
        String input="Hello,world!";
        int countwords = Task4.count(input);
        System.out.println("Number of words: " + countwords);
    }
}
