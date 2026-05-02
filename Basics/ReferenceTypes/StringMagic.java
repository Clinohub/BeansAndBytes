import java.util.Scanner;

public class StringMagic {


	/**
	 * This method counts the number of uppercase letters in a given string.
	 *
	 * @param str The string to count uppercase letters in.
	 * @return The number of uppercase letters in the string.
	 */
    public int countUppercaseLetters(String str) {
        int countUpperCase = 0;

	if (!str.isEmpty())
        for (int count = 0; count < str.length(); count++) {
            if (Character.isUpperCase(str.charAt(count))) {
                countUpperCase += 1;
            }
        }

        return countUpperCase;
    }


    /**
	 * This method checks if a given string contains any
     * two consecutive identical characters
	 *
	 * @param str String of length n (0 ≤ n ≤ 1000).
     * The string may contain any printable ASCII characters.
	 * @return true if string two consecutive identical
     * characters in the string and false otherwise.
	 */
    public boolean hasConsecutiveDuplicates(String str) {
        if (str.isEmpty())
            return false;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1))
                return true;
        }
        return false;
    }


    /**
	 * This method checks for the rightmost digit in a given string.
	 *
	 * @param str
     * The string may contain any printable ASCII characters.
	 * @return rightmost digit in string.
	 */
    public int getRightmostDigit(String str) {
        if (str.isEmpty())
            return -1;

        for (int i = str.length() - 1; i >= 0; i--) {
            char individualCharacter = str.charAt(i);
            if (Character.isDigit(individualCharacter))
                return Character.getNumericValue(individualCharacter);
        }

        return -1;
    }


    /**
     * Method finds the longest word in a given sentence
     *  
     * @param sentence as a string input
     * @return longest string in the sentence otherwise empty string if sentence is empty
     */
    public String findLongestWord(String sentence) {
        if (sentence.isEmpty()) {
            return "";
        }

        String longestWord = "";
        String[] arrayWord = sentence.split(" ");
        for (String word: arrayWord) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }


    public static void main(String[] args) {
        StringMagic stringMagic = new StringMagic();
        int uppercaseLetters = stringMagic.countUppercaseLetters("Hello WORLd");
        System.out.println(uppercaseLetters);

        uppercaseLetters = stringMagic.countUppercaseLetters("HELLO WORLD");
        System.out.println(uppercaseLetters);

        uppercaseLetters = stringMagic.countUppercaseLetters("hello world");
        System.out.println(uppercaseLetters);

        uppercaseLetters = stringMagic.countUppercaseLetters("");
        System.out.println(uppercaseLetters);
        System.out.println();
        

        boolean actual = stringMagic.hasConsecutiveDuplicates("Hello");
        System.out.println(actual);
        
        actual = stringMagic.hasConsecutiveDuplicates("World");
        System.out.println(actual);

        actual = stringMagic.hasConsecutiveDuplicates("");
        System.out.println(actual);
        
        actual = stringMagic.hasConsecutiveDuplicates("H");
        System.out.println(actual);

        actual = stringMagic.hasConsecutiveDuplicates("HHH");
        System.out.println(actual);
        System.out.println();


        int rightmostDigit = stringMagic.getRightmostDigit("hello2world5");
        System.out.println(rightmostDigit);

        rightmostDigit = stringMagic.getRightmostDigit("helloworld");
        System.out.println(rightmostDigit);

        rightmostDigit = stringMagic.getRightmostDigit("12345");
        System.out.println(rightmostDigit);

        rightmostDigit = stringMagic.getRightmostDigit("6months");
        System.out.println(rightmostDigit);

        rightmostDigit = stringMagic.getRightmostDigit("Python 3.9");
        System.out.println(rightmostDigit);

        rightmostDigit = stringMagic.getRightmostDigit("");
        System.out.println(rightmostDigit);

        
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a sentence: ");
        String input = scanner.nextLine();
        System.out.println("Longest word in the sentence: " + stringMagic.findLongestWord(input));
        scanner.close();
    }
}
