public class MyCharSwitch {
	public boolean isVowel(char ch) {
		switch (ch) {
			case 'A','E','I','O','U':
			case 'a','e','i','o','u': return true;
		}
		return false;
	}

	public static void main(String[] args) {
		MyCharSwitch myChar = new MyCharSwitch();

		System.out.println(myChar.isVowel('A'));
		System.out.println(myChar.isVowel('a'));
                System.out.println(myChar.isVowel('E'));
		System.out.println(myChar.isVowel('e'));
		System.out.println(myChar.isVowel('I'));
		System.out.println(myChar.isVowel('i'));
		System.out.println(myChar.isVowel('O'));
		System.out.println(myChar.isVowel('o'));
		System.out.println(myChar.isVowel('U'));
		System.out.println(myChar.isVowel('u'));
		System.out.println(myChar.isVowel('Z'));
		System.out.println(myChar.isVowel('7'));
	}
} 
