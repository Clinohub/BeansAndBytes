public class StringMagic {


	/**
	 * This method counts the number of uppercase letters in a given string.
	 *
	 * @param str The string to count uppercase letters in.
	 * @return The number of uppercase letters in the string.
	 */
    public int countUppercaseLetters(String str) {
        int upperCase = 0;

	if (str.isEmpty())
		return upperCase;

        for (int count = 0; count < str.length(); count++) {
		//char ch = str.charAt
            if (Character.isUpperCase(str.charAt(count))) {
            // if (str.charAt(count) >= 65 && str.charAt(count) <= 90) {
                upperCase += 1;
            }
        }

        return upperCase;
    }

    public static void main(String[] args) {
        StringMagic stringMagic = new StringMagic();
        int uppercaseLetters = stringMagic.countUppercaseLetters("Hello WORLd");
        System.out.println(uppercaseLetters); // This will print 5
    }
}
