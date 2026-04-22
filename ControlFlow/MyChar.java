public class MyChar {
    private char vowel;

    public MyChar(char vowel) {
        this.vowel = vowel;
    }

    public boolean isVowel() {
        boolean isVowel = false;
        if (ifCapital())
            isVowel = true;
        else if (vowel == 'a')
            isVowel = true;
        else if (vowel == 'e')
            isVowel = true;
        else if (vowel == 'i')
            isVowel = true;
        else if (vowel == 'o')
            isVowel = true;
        else if (vowel == 'u')
            isVowel = true;
        else
            isVowel = false;

        return isVowel;
    }

    public boolean ifCapital() {
        return (int)vowel >= 65 && (int)vowel <=90;
    }

    public int isNumber() {
        return (int)vowel;
    }

    public char isAlphabet() {
        return vowel;
    }

    public void printLowerCaseAlphabets() {
        if (ifCapital()) {
            vowel += 32;
        }
        System.out.println(vowel);
    }

    public void printUpperCaseAlphabets() {
        if (!ifCapital()) {
            vowel -= 32;
        }
        System.out.println(vowel);
    }

    public static void main(String[] args) {
        MyChar myChar = new MyChar('e');
        System.out.println(myChar.isVowel());
            //vowels and capitals
        System.out.println(myChar.isNumber());
        System.out.println(myChar.isAlphabet());
        myChar.printLowerCaseAlphabets();
        
        myChar.printUpperCaseAlphabets();
    }
}
